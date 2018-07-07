/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:53:00 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-24 12:38:32
 */
package com.rsia.madura.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PasienDAO;
import com.rsia.madura.entity.MPasien;

@Service
public class PasienServiceAction implements PasienService {
	@Autowired
	private PasienDAO pasienDAO;

	@Transactional
	@Override
	public List<MPasien> findAll() {
		return pasienDAO.getPasien();
	}

	@Override
	@Transactional
	public List<MPasien> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return pasienDAO.getPasiens(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return pasienDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPasien getById(int id) {
		// TODO Auto-generated method stub
		return pasienDAO.getPasien(id);
	}

	@Override
	@Transactional
	public void store(MPasien data) {
		// TODO Auto-generated method stub
		pasienDAO.PasienStore(data);

	}

	@Override
	@Transactional
	public void update(MPasien data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPasienUpdatedBy("Admin");
		data.setPasienUpdatedDate(currentTime);
		pasienDAO.PasienUpdate(data);		
	}

	@Override
	@Transactional
	public void delete(MPasien data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPasienAktif("T");
		data.setPasienDeletedBy("Admin");
		data.setPasienDeletedDate(currentTime);
		pasienDAO.PasienDelete(data);

	}

}
