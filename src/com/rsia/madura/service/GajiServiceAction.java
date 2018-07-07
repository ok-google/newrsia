package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.GajiDAO;
import com.rsia.madura.entity.MGaji;

@Service
public class GajiServiceAction implements GajiService {
	@Autowired
	// sesuaoi dao dengan yang dibuat baru
	private GajiDAO gajiDAO;
	
	@Override
	@Transactional
	public List<MGaji> getGajis() {
	
		return gajiDAO.getGajis();
	}
	@Override
	@Transactional
	public List<MGaji> getGajis(int page, int limit){
		return gajiDAO.getGajis(page, limit);
	}
	
	
	public String createLinks(int page, int limit) {
		return gajiDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MGaji getGaji(int gajiId) {
		
		return gajiDAO.getGaji(gajiId);	
	}

	@Override
	public void getTotal(MGaji gajiModel) {
		
		gajiDAO.getTotal(gajiModel);

	}

	@Override
	@Transactional
	public void store(MGaji gajiModel) {
		
		gajiDAO.gajiStore(gajiModel);

	}

	@Override
	@Transactional
	public void update(MGaji gajiModel) {
		
		gajiDAO.gajiUpdate(gajiModel);

	}

	@Override
	@Transactional
	public void delete(MGaji gajiModel) {
		
		gajiDAO.gajiDelete(gajiModel);

	}

}
