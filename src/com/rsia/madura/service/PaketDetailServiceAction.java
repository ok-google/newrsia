/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:29:50
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDetailDAO;
import com.rsia.madura.entity.MPaketDetail;

@Service
public class PaketDetailServiceAction implements PaketDetailService {
	@Autowired
	private PaketDetailDAO paketDetailDAO;

	@Override
	@Transactional
	public List<MPaketDetail> findAll() {
		// TODO Auto-generated method stub
		return this.paketDetailDAO.getPaketDetails();
	}

	@Override
	@Transactional
	public List<MPaketDetail> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDetailDAO.getPaketDetails(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaketDetail getById(int id) {
		// TODO Auto-generated method stub
		return paketDetailDAO.getPaketDetail(id);
	}

	@Override
	@Transactional
	public void store(MPaketDetail data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketDetailCreatedDate(currentTime);
		paketDetailDAO.PaketDetailStore(data);
	}

	@Override
	@Transactional
	public void update(MPaketDetail data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketDetailUpdatedDate(currentTime);
		paketDetailDAO.PaketDetailUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPaketDetail data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		paketDetailDAO.PaketDetailDelete(data);
	}
}