/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:14:14
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ObatDAO;
import com.rsia.madura.entity.MObat;

@Service
public class ObatServiceAction implements ObatService {
	@Autowired
	private ObatDAO obatDAO;

	@Override
	@Transactional
	public List<MObat> findAll() {
		// TODO Auto-generated method stub
		return this.obatDAO.getObats();
	}

	@Override
	@Transactional
	public List<MObat> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return obatDAO.getObats(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return obatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MObat getById(int id) {
		// TODO Auto-generated method stub
		return obatDAO.getObat(id);
	}

	@Override
	@Transactional
	public void store(MObat data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setObat_aktif("Y");
		data.setObat_created_by("Admin");	
		data.setObat_created_date(currentTime);
		obatDAO.ObatStore(data);
	}

	@Override
	@Transactional
	public void update(MObat data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setObat_aktif("Y");
		data.setObat_updated_by("Admin");
		data.setObat_updated_date(currentTime);
		obatDAO.ObatUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MObat data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setObat_aktif("T");
		data.setObat_deleted_by("Admin");
		data.setObat_deleted_date(currentTime);
		obatDAO.ObatDelete(data);
	}
}