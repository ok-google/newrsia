package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MBarangKategori;
import com.rsia.madura.dao.BarangKategoriDAO;

@Service
public class BarangKategoriServiceAction implements BarangKategoriService {
	@Autowired
	private BarangKategoriDAO barangKategoriDAO; 
	
	
	@Override
	@Transactional
	public List<MBarangKategori> getKategoris() {
		return barangKategoriDAO.getKategoris();
	}

	@Override
	@Transactional
	public List<MBarangKategori> getKategoris(int page, int limit) {
		return barangKategoriDAO.getKategoris(page, limit);
	}

	@Override
	@Transactional
	public MBarangKategori getBarangKategori(int kategoriId) {
		return barangKategoriDAO.getBarangKategori(kategoriId);
	}

	@Override
	public String createLinks(int page, int limit) {
		return barangKategoriDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public int store(MBarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriStore(kategoriModel);

	}

	@Override
	@Transactional
	public int update(MBarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriUpdate(kategoriModel);

	}

	@Override
	@Transactional
	public int delete(MBarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriDelete(kategoriModel);

	}

}
