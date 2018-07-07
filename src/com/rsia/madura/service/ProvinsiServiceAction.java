/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:40:22 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:40:22 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ProvinsiDAO;
import com.rsia.madura.entity.MProvinsi;

@Service
public class ProvinsiServiceAction implements ProvinsiService {
	@Autowired
	private ProvinsiDAO provinsiDAO;
	
	@Override
	@Transactional
	public List<MProvinsi> getProvinsis() {
		// TODO Auto-generated method stub
		return provinsiDAO.getProvinsis();
	}
	
	@Override
	@Transactional
	public List<MProvinsi> getProvinsis(int page, int limit){
		return provinsiDAO.getProvinsis(page, limit);
	}
	
	
	public String createLinks(int page, int limit) {
		return provinsiDAO.createLinks(page, limit);
	}
	
	@Override
	@Transactional
	public void store(MProvinsi provinsiModel) {
		
		provinsiDAO.provinsiStore(provinsiModel);
	}

	@Override
	@Transactional
	public MProvinsi getProvinsi(int provinsiId) {
		
		return provinsiDAO.getProvinsi(provinsiId);
	}

	@Override
	@Transactional
	public void update(MProvinsi provinsiModel) {
		
		provinsiDAO.provinsiUpdate(provinsiModel);
		
	}

	@Override
	@Transactional
	public void delete(MProvinsi provinsiModel) {
		provinsiDAO.provinsiDelete(provinsiModel);
		
	}

}
