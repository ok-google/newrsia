package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MBarangDetail;;

@Repository
public class BarangDetailAction implements BarangDetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MBarangDetail> getBarangDetails() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MBarangDetail> barang = current.createQuery("from MBarangDetail", MBarangDetail.class);
		List<MBarangDetail> result = barang.getResultList();
		
		return result;
	}
	
	@Override
	public List<MBarangDetail> getBarangDetails(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MBarangDetail> query = current.createQuery("from MBarangDetail", MBarangDetail.class);
		List<MBarangDetail> barangdetail = query.getResultList();
		this.total = barangdetail.size();
		barangdetail = this.getData(page, limit);
		
		return barangdetail;
	}

	private List<MBarangDetail> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<MBarangDetail> query = current.createQuery("from MBarangDetail", MBarangDetail.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MBarangDetail> Result = query.getResultList();

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
	public MBarangDetail getBarangDetail(int barangdet_id) {
		Session current = sessionFactory.getCurrentSession();
		
		MBarangDetail result = current.get(MBarangDetail.class, barangdet_id);
		
		return result;
	}
	
	@Override
	public int barangdetailStore(MBarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(barangdetailModel);
		current.flush();
		
		return barangdetailModel.getBarangDetId();
	}

	@Override
	public int barangdetailUpdate(MBarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangdetailModel);
		current.flush();
		
		return barangdetailModel.getBarangDetId();
	}

	@Override
	public int barangdetailDelete(MBarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangdetailModel);
		current.flush();
		
		return barangdetailModel.getBarangDetId();
		
	}

}
