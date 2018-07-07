/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-25 13:27:33
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PenunjangDAO;
import com.rsia.madura.entity.MPenunjang;

@Service
public class PenunjangServiceAction implements PenunjangService {
	@Autowired
	private PenunjangDAO penunjangDAO;

	@Override
	@Transactional
	public List<MPenunjang> findAll() {
		// TODO Auto-generated method stub
		return this.penunjangDAO.getPenunjangs();
	}

	@Override
	@Transactional
	public List<MPenunjang> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.getPenunjangs(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPenunjang getById(int id) {
		// TODO Auto-generated method stub
		return penunjangDAO.getPenunjang(id);
	}

	@Override
	@Transactional
	public void store(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedisAktif("Y");
		data.setPenunjangmedisCreatedBy("Admin");	
		data.setPenunjangmedisCreatedDate(currentTime);
		if (data.getParamperiksa() != null) {
			data.getParamperiksa().forEach((paramperiksa) -> {
				paramperiksa.setPenunjang(data);
				paramperiksa.setParamperiksaAktif("Y");
				paramperiksa.setParamperiksaCreatedBy("Admin");
				paramperiksa.setParamperiksaCreatedDate(currentTime);
			});
		}
		
		if (data.getPenunjangkelas() != null) {
			data.getPenunjangkelas().forEach((penunjangkelas) -> {
				penunjangkelas.setPenunjang(data);
			});
		}
		penunjangDAO.PenunjangStore(data);
	}

	@Override
	@Transactional
	public void update(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedisAktif("Y");
		data.setPenunjangmedisUpdatedBy("Admin");
		data.setPenunjangmedisUpdatedDate(currentTime);

		if (data.getParamperiksa() != null) {
			data.getParamperiksa().forEach((paramperiksa) -> {
				paramperiksa.setPenunjang(data);
				paramperiksa.setParamperiksaUpdatedBy("Admin");
				paramperiksa.setParamperiksaUpdatedDate(currentTime);
			});
		}

		if (data.getPenunjangkelas() != null) {
			data.getPenunjangkelas().forEach((penunjangkelas) -> {
				penunjangkelas.setPenunjang(data);
			});
		}

		penunjangDAO.PenunjangUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedisAktif("T");
		data.setPenunjangmedisDeletedBy("Admin");
		data.setPenunjangmedisDeletedDate(currentTime);
		penunjangDAO.PenunjangDelete(data);
	}
}