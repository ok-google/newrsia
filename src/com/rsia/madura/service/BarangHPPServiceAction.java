package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MBarangHPP;
import com.rsia.madura.dao.BarangHPPDAO;

@Service
public class BarangHPPServiceAction implements BarangHPPService {

	@Autowired
	private BarangHPPDAO baranghppDAO;
	
	@Override
	@Transactional
	public List<MBarangHPP> getBarangHPPs() {
		// TODO Auto-generated method stub
		return baranghppDAO.getBaranghpps();
	}

	@Override
	@Transactional
	public List<MBarangHPP> getBarangHPPs(int page, int limit) {
		// TODO Auto-generated method stub
		return baranghppDAO.getBaranghpps(page, limit);
	}

	@Override
	@Transactional
	public MBarangHPP getBarangHPP(int IdBarangHPP) {
		// TODO Auto-generated method stub
		return baranghppDAO.getBarangHPP(IdBarangHPP);
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return baranghppDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public int store(MBarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppStore(baranghppModel);
		
	}

	@Override
	@Transactional
	public int update(MBarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppUpdate(baranghppModel);
	}

	@Override
	@Transactional
	public int delete(MBarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppDelete(baranghppModel);
	}

}
