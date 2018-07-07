/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:17:21 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:17:21 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MKota;

@Repository
public class KotaAction implements KotaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MKota> getKotas(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MKota> query = current.createQuery("from MKota", MKota.class);
		List<MKota> kota = query.getResultList();
		this.total = kota.size();
		kota = this.getData(page, limit);
		
		return kota;
	}
	
	@Override
	public List<MKota> getKotas() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MKota> query = current.createQuery("from MKota", MKota.class);
		List<MKota> kota = query.getResultList();
		
		return kota;
	}
    
    public List<MKota> getData( int page, int limit) {
    	Session current = sessionFactory.getCurrentSession();
    	Query<MKota> query = current.createQuery("from MKota", MKota.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MKota> Result = query.getResultList();

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

        String status      = ( page == last ) ? "disabled" : "";
        html       = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + ( page + 1 ) + "'>&raquo;</a></li>";

        html       = html + "</ul>";

        return html;
    }

	@Override
	public MKota getKota(int kotaId) {
		Session current = sessionFactory.getCurrentSession();
		
		MKota result = current.get(MKota.class, kotaId);
		return result;
	}

	@Override
	public void kotaStore(MKota kotaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kotaModel);
		
	}

	@Override
	public void kotaUpdate(MKota kotaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kotaModel);
		
	}

	@Override
	public void kotaDelete(MKota kotaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kotaModel);
		
	}
}
