package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PerusahaanKategoriDAO;
import com.rsia.madura.entity.MPerusahaanKategori;

@Service
public class PerusahaanKategoriServiceAction implements PerusahaanKategoriService {
	@Autowired
	private PerusahaanKategoriDAO perusahaanKategoriDAO;
	
	@Override
	@Transactional
	public List<MPerusahaanKategori> getPerusahaans() {
		
		return perusahaanKategoriDAO.getPerusahaans();
	}

	@Override
	@Transactional
	public List<MPerusahaanKategori> getPerusahaans(int page, int limit) {
		
		
		return perusahaanKategoriDAO.getPerusahaans(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		
		return perusahaanKategoriDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPerusahaanKategori getPerusahaan(int perusahaanKategoriId) {

		return perusahaanKategoriDAO.getPerusahaan(perusahaanKategoriId);
	}

	@Override
	@Transactional
	public int store(MPerusahaanKategori perusahaanKategoriModel) {
		
		return perusahaanKategoriDAO.perusahaanKategoriStore(perusahaanKategoriModel);
	}

	@Override
	@Transactional
	public int update(MPerusahaanKategori perusahaanKategoriModel) {

		return perusahaanKategoriDAO.perusahaanKategoriUpdate(perusahaanKategoriModel);
	}

	@Override
	@Transactional
	public int delete(MPerusahaanKategori perusahaanKategoriModel) {

		return perusahaanKategoriDAO.perusahaanKategoriDelete(perusahaanKategoriModel);
	}

}
