/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:17:07 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:17:07 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.entity.MProvinsi;

@Repository
public class KondisiPasienAction implements KondisiPasienDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MKondisi> getKondisis() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		Query<MKondisi> query = current.createQuery("from MKondisi k WHERE k.kondisiAktif = :kondisiAktif", MKondisi.class);
		query.setParameter("kondisiAktif", "Y");
		List<MKondisi> kondisi = query.getResultList();
		
		return kondisi;
	}

	@Override
	public List<MKondisi> getKondisis(int page, int limit) {
		List<MKondisi> kondisi = this.getData(page, limit);
		this.total = this.getKondisis().size();
		
		return kondisi;
	}

	public List<MKondisi> getData( int page, int limit) {
    	Session current = sessionFactory.getCurrentSession();
    	Query<MKondisi> query = current.createQuery("from MKondisi k WHERE k.kondisiAktif = :kondisiAktif", MKondisi.class).setFirstResult((page-1)*limit).setMaxResults(limit);
    	query.setParameter("kondisiAktif", "Y");
        List<MKondisi> kondisi = query.getResultList();

        return kondisi;
    }

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last       = Math.ceil( (double)this.total / (double)limit );

        int start      = ( ( page - 5 ) > 0 ) ? page - 5 : 1;
        int end        = (int) (( ( page + 5 ) < last ) ? page + 5 : last);

        String html       = "<ul class='pagination'>";

        String first     = ( page == 1 ) ? "disabled" : "";
        html = html + "<li class='page-first' "+ first + "><a href='?limit=" + limit + "&page=" + ( page - 1 ) + "'>&laquo;</a></li>";

        if ( start > 1 ) {
            html   = html + "<li class='page-number'><a href='?limit="+ limit + "&page=1'>1</a></li>";
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
        }

        for ( int i = start ; i <= end; i++ ) {
            String position  = ( page == i ) ? "active" : "";
            html   = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> "+ i + "</a></li>";
        }

        if ( end < last ) {
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
            html   = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int)last + "'>" + (int)last + "</a></li>";
        }

        String status      = ( page == (int)last ) ? "disabled" : "";
        html       = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + ( page + 1 ) + "'>&raquo;</a></li>";

        html       = html + "</ul>";

        return html;
	}

	@Override
	public MKondisi getKondisi(int kondisiId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		MKondisi result = current.get(MKondisi.class, kondisiId);
		
		return result;
	}

	@Override
	public void kondisiStore(MKondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kondisiModel);
	}

	@Override
	public void kondisiUpdate(MKondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kondisiModel);
		
	}

	@Override
	public void kondisiDelete(MKondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kondisiModel);
		
	}
	

}
