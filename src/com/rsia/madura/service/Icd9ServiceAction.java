/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 22:53:08
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-29 05:25:08
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.Icd9DAO;
import com.rsia.madura.entity.MIcd9;

@Service
public class Icd9ServiceAction implements Icd9Service {
	@Autowired
	private Icd9DAO icd9DAO;

	@Override
	@Transactional
	public List<MIcd9> findAll() {
		// TODO Auto-generated method stub
		return this.icd9DAO.getIcd9s();
	}

	@Override
	@Transactional
	public List<MIcd9> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return icd9DAO.getIcd9s(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return icd9DAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MIcd9 getById(int id) {
		// TODO Auto-generated method stub
		return icd9DAO.getIcd9(id);
	}

	@Override
	@Transactional
	public void store(MIcd9 data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcd9Aktif("Y");
		data.setIcd9CreatedBy("Admin");	
		data.setIcd9CreatedDate(currentTime);
		icd9DAO.icd9Store(data);
	}

	@Override
	@Transactional
	public void update(MIcd9 data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcd9Aktif("Y");
		data.setIcd9UpdatedBy("Admin");
		data.setIcd9UpdatedDate(currentTime);
		icd9DAO.icd9Update(data);
	}

	@Override
	@Transactional
	public void delete(MIcd9 data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setIcd9Aktif("T");
		icd9DAO.icd9Delete(data);
	}
}