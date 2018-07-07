package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MBarangKategori;

@Repository
public class BarangKategoriAction implements BarangKategoriDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int total;
	
	@Override
	public List<MBarangKategori> getKategoris() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MBarangKategori> query = current.createQuery("from MBarangKategori", MBarangKategori.class);
		
		List<MBarangKategori> kategori = query.getResultList();
		return kategori;
	}

	@Override
	public List<MBarangKategori> getKategoris(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MBarangKategori> query = current.createQuery("from MBarangKategori", MBarangKategori.class);
		List<MBarangKategori> kategori = query.getResultList();
		this.total = kategori.size();
		kategori = this.getData(page, limit);
		
		return kategori;
	}

	private List<MBarangKategori> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<MBarangKategori> query = current.createQuery("from MBarangKategori", MBarangKategori.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<MBarangKategori> Result = query.getResultList();

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
	public MBarangKategori getBarangKategori(int kategoriId) {
		Session current = sessionFactory.getCurrentSession();
		
		MBarangKategori result = current.get(MBarangKategori.class, kategoriId);
		
		return result;
	}

	@Override
	public int kategoriStore(MBarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kategoriModel);
		current.flush();
		
		return kategoriModel.getBarangKategoriId();
	}

	@Override
	public int kategoriUpdate(MBarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kategoriModel);
		current.flush();
		
		return kategoriModel.getBarangKategoriId();
	}

	@Override
	public int kategoriDelete(MBarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kategoriModel);
		current.flush();
		
		return kategoriModel.getBarangKategoriId();
	}

}
