/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 16:02:53
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-15 16:14:15
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ParamPeriksaDAO;
import com.rsia.madura.entity.MParamPeriksa;

@Service
public class ParamPeriksaServiceAction implements ParamPeriksaService {
	@Autowired
	private ParamPeriksaDAO penunjangDAO;

	@Override
	@Transactional
	public List<MParamPeriksa> findAll() {
		// TODO Auto-generated method stub
		return this.penunjangDAO.getParamPeriksases();
	}

	@Override
	@Transactional
	public List<MParamPeriksa> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.getParamPeriksases(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MParamPeriksa getById(int id) {
		// TODO Auto-generated method stub
		return penunjangDAO.getParamPeriksa(id);
	}

	@Override
	@Transactional
	public void store(MParamPeriksa data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setParamperiksaAktif("Y");
		data.setParamperiksaCreatedBy("Admin");	
		data.setParamperiksaCreatedDate(currentTime);
		penunjangDAO.ParamPeriksaStore(data);
	}

	@Override
	@Transactional
	public void update(MParamPeriksa data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setParamperiksaAktif("Y");
		data.setParamperiksaUpdatedBy("Admin");
		data.setParamperiksaUpdatedDate(currentTime);
		penunjangDAO.ParamPeriksaUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MParamPeriksa data) {
		// // TODO Auto-generated method stub
		// Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		// data.setParamperiksaAktif("T");
		// data.setParamperiksaDeletedBy("Admin");
		// data.setParamperiksaDeletedDate(currentTime);
		// penunjangDAO.ParamPeriksaDelete(data);
	}
}