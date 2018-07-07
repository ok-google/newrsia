package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MOrderDetail;

@Repository
public class OrderDetailAction implements OrderDetailDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<MOrderDetail> getOrderDetails() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MOrderDetail> query = current.createQuery("from MOrderDetail", MOrderDetail.class);
		List<MOrderDetail> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<MOrderDetail> getOrderDetails(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MOrderDetail> query = current.createQuery("from MOrderDetail", MOrderDetail.class);
		List<MOrderDetail> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<MOrderDetail> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<MOrderDetail> query = current.createQuery("from MOrderDetail", MOrderDetail.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MOrderDetail> Result = query.getResultList();

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
	public MOrderDetail getOrderDetail(int orderDetailId) {
		Session current = sessionFactory.	getCurrentSession();
		
		MOrderDetail result = current.get(MOrderDetail.class, orderDetailId);
		
		return result;
	}

	@Override
	public int orderDetailStore(MOrderDetail orderDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(orderDetailModel);
		current.flush();
		
		return orderDetailModel.getOrderDetailId();
	}

	@Override
	public int orderDetailUpdate(MOrderDetail orderDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(orderDetailModel);
		current.flush();
		
		return orderDetailModel.getOrderDetailId();
	}

	@Override
	public int orderDetailDelete(MOrderDetail orderDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(orderDetailModel);
		current.flush();
		
		return orderDetailModel.getOrderDetailId();
	}

	@Override
	public List<MOrderDetail> where(String column, String value) {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MOrderDetail> query = current.createQuery("from MOrderDetail where " +
		column + " = " + value, MOrderDetail.class);
		
		List<MOrderDetail> result = query.getResultList();
		
		return result;
	}

	@Override
	public int updateOrderId(int orderId) {
		Session current = sessionFactory.getCurrentSession();
		
		Query query = current.createQuery("update MOrderDetail set orderDetailOrderId = :id "+
		"where orderDetailOrderId = 1", MOrderDetail.class);
		query.setParameter("id", orderId);
		int result = query.executeUpdate();
		
		return result;
	}

}
