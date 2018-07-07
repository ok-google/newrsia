package com.rsia.madura.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MBarangDetail;

import com.rsia.madura.dao.BarangDAO;

@Service
public class BarangServiceAction implements BarangService {
	@Autowired
	private BarangDAO barangDAO;

	@Override
	@Transactional
	public List<MBarang> getBarangs() {
		return barangDAO.getBarangs();
	}

	@Override
	@Transactional
	public List<MBarang> getBarangs(int page, int limit) {
		
		return barangDAO.getBarangs(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return barangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MBarang getBarang(int barangId) {

		return barangDAO.getBarang(barangId);
	}

	@Override
	@Transactional
	public int store(MBarang barangModel) {
        //return delDetail;
		return barangDAO.barangStore(barangModel);
	}

	@Override
	@Transactional
	public int update(MBarang barangModel) {
		// TODO Auto-generated method stub
		return barangDAO.barangUpdate(barangModel);
	}

	@Override
	@Transactional
	public int delete(MBarang barangModel) {
		// TODO Auto-generated method stub
		return barangDAO.barangDelete(barangModel);
	}
	
	

}
