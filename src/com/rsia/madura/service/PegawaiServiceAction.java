/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:53:00 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-14 17:53:00 
 */
package com.rsia.madura.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PegawaiDAO;
import com.rsia.madura.entity.MPegawai;

@Service
public class PegawaiServiceAction implements PegawaiService {
	@Autowired
	private PegawaiDAO pegawaiDAO;

	@Transactional
	@Override
	public List<MPegawai> getPegawai() {
		return pegawaiDAO.getPegawai();
	}

	@Override
	@Transactional
	public List<MPegawai> getPegawais(int page, int limit) {
		// TODO Auto-generated method stub
		return pegawaiDAO.getPegawais(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return pegawaiDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPegawai getPegawai(int id) {
		// TODO Auto-generated method stub
		return pegawaiDAO.getPegawai(id);
	}

	@Override
	@Transactional
	public void store(MPegawai data) {
		// TODO Auto-generated method stub
		pegawaiDAO.PegawaiStore(data);

	}

	@Override
	@Transactional
	public void update(MPegawai data) {
		// TODO Auto-generated method stub
		pegawaiDAO.PegawaiUpdate(data);		
	}

	@Override
	@Transactional
	public void delete(MPegawai data) {
		// TODO Auto-generated method stub
		pegawaiDAO.PegawaiDelete(data);

	}

}
