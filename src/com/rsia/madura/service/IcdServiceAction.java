/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 14:15:03
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-27 14:26:57
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.IcdDAO;
import com.rsia.madura.entity.MIcd;

@Service
public class IcdServiceAction implements IcdService {
	@Autowired
	private IcdDAO icdDAO;

	@Override
	@Transactional
	public List<MIcd> findAll() {
		// TODO Auto-generated method stub
		return this.icdDAO.getIcds();
	}

	@Override
	@Transactional
	public List<MIcd> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return icdDAO.getIcds(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return icdDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MIcd getById(int id) {
		// TODO Auto-generated method stub
		return icdDAO.getIcd(id);
	}

	@Override
	@Transactional
	public void store(MIcd data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcdAktif("Y");
		data.setIcdCreatedBy("Admin");	
		data.setIcdCreatedDate(currentTime);
		icdDAO.icdStore(data);
	}

	@Override
	@Transactional
	public void update(MIcd data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcdAktif("Y");
		data.setIcdUpdatedBy("Admin");
		data.setIcdUpdatedDate(currentTime);
		icdDAO.icdUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MIcd data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcdAktif("T");
		icdDAO.icdDelete(data);
	}
}