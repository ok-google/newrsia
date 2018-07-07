package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JenisBarangDAO;
import com.rsia.madura.entity.MJenisBarang;

@Service
public class JenisBarangServiceAction implements JenisBarangService{
	@Autowired
	private JenisBarangDAO jenisBarangDAO;
	
	@Override
	@Transactional
	public List<MJenisBarang> getJenisBarangs() {
		
		return jenisBarangDAO.getJenisBarangs();
	}

	@Override
	@Transactional
	public MJenisBarang getJenisBarang(int jenisBarangId) {
		
		return jenisBarangDAO.getJenisBarang(jenisBarangId);
	}

	@Override
	@Transactional
	public int store(MJenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangStore(jenisBarangModel);
		
	}

	@Override
	@Transactional
	public int update(MJenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangUpdate(jenisBarangModel);
	}

	@Override
	@Transactional
	public int delete(MJenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangDelete(jenisBarangModel);
	}

}
