package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MOpnameDetail;

@Repository
public class OpnameDetailAction implements OpnameDetailDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<MOpnameDetail> getOpnameDetails() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MOpnameDetail> query = current.createQuery("from MOpnameDetail", MOpnameDetail.class);
		List<MOpnameDetail> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<MOpnameDetail> getOpnameDetails(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MOpnameDetail> query = current.createQuery("from MOpnameDetail", MOpnameDetail.class);
		List<MOpnameDetail> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<MOpnameDetail> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<MOpnameDetail> query = current.createQuery("from MOpnameDetail", MOpnameDetail.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MOpnameDetail> Result = query.getResultList();

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
	public MOpnameDetail getOpnameDetail(int opnameDetailId) {
		Session current = sessionFactory.	getCurrentSession();
		
		MOpnameDetail result = current.get(MOpnameDetail.class, opnameDetailId);
		
		return result;
	}

	@Override
	public int opnameDetailStore(MOpnameDetail opnameDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(opnameDetailModel);
		current.flush();
		
		return opnameDetailModel.getOpnameDetailId();
	}

	@Override
	public int opnameDetailUpdate(MOpnameDetail opnameDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(opnameDetailModel);
		current.flush();
		
		return opnameDetailModel.getOpnameDetailId();
	}

	@Override
	public int opnameDetailDelete(MOpnameDetail opnameDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(opnameDetailModel);
		current.flush();
		
		return opnameDetailModel.getOpnameDetailId();
	}

}
