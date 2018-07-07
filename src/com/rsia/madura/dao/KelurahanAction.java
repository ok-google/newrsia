/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 14:02:31 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 14:02:31 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MKelurahan;

@Repository
public class KelurahanAction implements KelurahanDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MKelurahan> getKelurahans() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MKelurahan> query = current.createQuery("from MKelurahan", MKelurahan.class);
		
		List<MKelurahan> Kelurahan = query.getResultList();
		
		return Kelurahan;
	}
	
	@Override
	public List<MKelurahan> getKelurahans(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MKelurahan> query = current.createQuery("from MKelurahan", MKelurahan.class);
		List<MKelurahan> Kelurahan = query.getResultList();
		this.total = Kelurahan.size();
		
		Kelurahan = this.getData(page, limit);
		
		return Kelurahan;
	}
	
	public List<MKelurahan> getData( int page, int limit) {
    	Session current = sessionFactory.getCurrentSession();
    	Query<MKelurahan> query = current.createQuery("from MKelurahan", MKelurahan.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MKelurahan> Result = query.getResultList();

        return Result;
    }
	
	@Override
    public String createLinks(int page, int limit) {
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
	public MKelurahan getKelurahan(int kelurahanId) {
		Session current = sessionFactory.getCurrentSession();
		
		MKelurahan result = current.get(MKelurahan.class, kelurahanId);
		return result;
	}

	@Override
	public void kelurahanStore(MKelurahan kelurahanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kelurahanModel);
		
	}

	@Override
	public void kelurahanUpdate(MKelurahan kelurahanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kelurahanModel);
		
	}

	@Override
	public void kelurahanDelete(MKelurahan kelurahanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kelurahanModel);
	}
}
