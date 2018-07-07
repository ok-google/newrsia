/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:25:36 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:25:36 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MProvinsi;

@Repository
public class ProvinsiAction implements ProvinsiDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MProvinsi> getProvinsis() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MProvinsi> query = current.createQuery("from MProvinsi", MProvinsi.class);
		
		List<MProvinsi> provinsi = query.getResultList();
		return provinsi;
	}
	
	@Override
	public List<MProvinsi> getProvinsis(int page, int limit){
		Session current = sessionFactory.getCurrentSession();
		Query<MProvinsi> query = current.createQuery("from MProvinsi", MProvinsi.class);
		List<MProvinsi> provinsi = query.getResultList();
		this.total = provinsi.size();
		provinsi = this.getData(page, limit);
		
		return provinsi;
	}
	
	public List<MProvinsi> getData( int page, int limit) {
    	Session current = sessionFactory.getCurrentSession();
    	Query<MProvinsi> query = current.createQuery("from MProvinsi", MProvinsi.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MProvinsi> Result = query.getResultList();

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
	public void provinsiStore(MProvinsi provinsiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(provinsiModel);
		
	}

	@Override
	public MProvinsi getProvinsi(int provinsiId) {
		Session current = sessionFactory.getCurrentSession();
		
		MProvinsi result = current.get(MProvinsi.class, provinsiId);
		
		return result;
	}

	@Override
	public void provinsiUpdate(MProvinsi provinsiModel) {
		
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(provinsiModel);
		
	}

	@Override
	public void provinsiDelete(MProvinsi provinsiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(provinsiModel);
	}
}
