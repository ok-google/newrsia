package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.BarangTransDAO;
import com.rsia.madura.entity.MBarangTrans;

@Service
public class BarangTransServiceAction implements BarangTransService {
	@Autowired
	private BarangTransDAO barangTransDAO;
	
	@Override
	@Transactional
	public List<MBarangTrans> getBarangTranss() {
	
		return barangTransDAO.getBarangTranss();
	}

	@Override
	@Transactional
	public List<MBarangTrans> getBarangTranss(int page, int limit) {

		return barangTransDAO.getBarangTranss(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return barangTransDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MBarangTrans getBarangTrans(int barangTransId) {

		return barangTransDAO.getBarangTrans(barangTransId);
	}

	@Override
	@Transactional
	public int store(MBarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransStore(barangTransModel);
	}

	@Override
	@Transactional
	public int update(MBarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransUpdate(barangTransModel);
	}

	@Override
	@Transactional
	public int delete(MBarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransDelete(barangTransModel);
	}

}
