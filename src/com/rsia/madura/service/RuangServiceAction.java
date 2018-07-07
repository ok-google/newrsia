/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:19:45
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RuangDAO;
import com.rsia.madura.entity.MRuang;

@Service
public class RuangServiceAction implements RuangService {
	@Autowired
	private RuangDAO ruangDAO;

	@Override
	@Transactional
	public List<MRuang> findAll() {
		// TODO Auto-generated method stub
		return this.ruangDAO.getRuangs();
	}

	@Override
	@Transactional
	public List<MRuang> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return ruangDAO.getRuangs(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return ruangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MRuang getById(int id) {
		// TODO Auto-generated method stub
		return ruangDAO.getRuang(id);
	}

	@Override
	@Transactional
	public void store(MRuang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setRuangAktif("Y");
		data.setRuangCreatedBy("Admin");	
		data.setRuangCreatedDate(currentTime);
		ruangDAO.RuangStore(data);
	}

	@Override
	@Transactional
	public void update(MRuang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setRuangAktif("Y");
		data.setRuangUpdatedBy("Admin");
		data.setRuangUpdatedDate(currentTime);
		ruangDAO.RuangUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MRuang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setRuangAktif("T");
		data.setRuangDeletedBy("Admin");
		data.setRuangDeletedDate(currentTime);
		ruangDAO.RuangDelete(data);
	}
}