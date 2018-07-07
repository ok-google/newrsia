/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:22:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 14:57:32
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JenisLayananDAO;
import com.rsia.madura.entity.MJenisLayanan;

@Service
public class JenisLayananServiceAction implements JenisLayananService{
	@Autowired
	private JenisLayananDAO jenisLayananDAO;

	@Override
	@Transactional
	public List<MJenisLayanan> findAll() {
		// TODO Auto-generated method stub
		return this.jenisLayananDAO.getJenisLayanans();
	}

	@Override
	@Transactional
	public List<MJenisLayanan> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return this.jenisLayananDAO.getJenisLayanans(page, limit);
	}
	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return jenisLayananDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MJenisLayanan getJenisLayanan(int id) {
		// TODO Auto-generated method stub
		return jenisLayananDAO.getJenisLayanan(id);
	}

	@Override
	@Transactional
	public void store(MJenisLayanan data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setJenislayananAktif("Y");
		data.setJenislayananCreatedBy("Admin");	
		data.setJenislayananCreatedDate(currentTime);
		jenisLayananDAO.JenisLayananStore(data);
		
	}

	@Override
	@Transactional
	public void update(MJenisLayanan data) {
		// TODO Auto-generated method stub
		jenisLayananDAO.JenisLayananUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(MJenisLayanan data) {
		// TODO Auto-generated method stub
		jenisLayananDAO.JenisLayananDelete(data);
	}

}
