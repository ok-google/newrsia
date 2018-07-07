/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:29:50
*/
package com.rsia.madura.service;

import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDAO;
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MPaketDetail;

@Service
public class PaketServiceAction implements PaketService {
	@Autowired
	private PaketDAO paketDAO;

	@Override
	@Transactional
	public List<MPaket> findAll() {
		// TODO Auto-generated method stub
		return this.paketDAO.getPakets();
	}

	@Override
	@Transactional
	public List<MPaket> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDAO.getPakets(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		return paketDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaket getById(int id) {
		return paketDAO.getPaket(id);
	}

	@Override
	@Transactional
	public void store(MPaket data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketAktif("Y");
		data.setPaketCreatedBy("Admin");	
		data.setPaketCreatedDate(currentTime);

		if (data.getPaketDetail() != null) {
			data.getPaketDetail().forEach((detail) -> {
				detail.setPaket(data);
				detail.setPaketDetailCreatedBy("Admin");
				detail.setPaketDetailCreatedDate(currentTime);
				detail.setPaketDetailUpdatedDate(currentTime);
			});
		}

		paketDAO.PaketStore(data);
	}

	@Override
	@Transactional
	public void update(MPaket data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketAktif("Y");
		data.setPaketUpdatedBy("Admin");
		data.setPaketUpdatedDate(currentTime);

		if (data.getPaketDetail() != null) {
			data.getPaketDetail().forEach((detail) -> {
				detail.setPaket(data);
				detail.setPaketDetailUpdatedBy("Admin");
				detail.setPaketDetailUpdatedDate(currentTime);
			});
		}


		paketDAO.PaketUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPaket data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		data.getPaketDetail().forEach((harga) -> {
			harga.setPaket(data);
			harga.setPaketDetailDeletedBy("Admin");
			harga.setPaketDetailDeletedDate(currentTime);
		});		
		data.setPaketAktif("T");
		data.setPaketDeletedBy("Admin");
		data.setPaketDeletedDate(currentTime);
		paketDAO.PaketDelete(data);
	}
}