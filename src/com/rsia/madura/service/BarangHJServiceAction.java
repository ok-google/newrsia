package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MBarangHJ;
import com.rsia.madura.dao.BarangHJDAO;


@Service
public class BarangHJServiceAction implements BarangHJService {
	@Autowired
	private BarangHJDAO baranghjDAO;
	
	@Override
	@Transactional
	public List<MBarangHJ> getBarangHJs() {
		// TODO Auto-generated method stub
		return baranghjDAO.getBarangHJs();
	}
	
	@Override
	@Transactional
	public List<MBarangHJ> getBarangHJs(int page, int limit){
		
		return baranghjDAO.getBarangHJs(page, limit);
	}
	
	@Override
	public String createLinks(int page, int limit) {
		return baranghjDAO.createLinks(page, limit);
	}
	
	@Override
	@Transactional
	public MBarangHJ getBarangHJ(int IDBarangHJ) {
		
		return baranghjDAO.getbarangHJ(IDBarangHJ);
	
	}
	
	@Override
	@Transactional
	public int store(MBarangHJ baranghjModel) {
		
		return baranghjDAO.baranghjStore(baranghjModel);
	}
	
	@Override
	@Transactional
	public int update(MBarangHJ baranghjModel) {
		
		return baranghjDAO.barangHJUpdate(baranghjModel);
		
	}

	@Override
	@Transactional
	public int delete(MBarangHJ baranghjModel) {
		return baranghjDAO.BarangHJDelete(baranghjModel);
		
	}

}