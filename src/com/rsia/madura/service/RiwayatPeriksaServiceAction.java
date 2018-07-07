/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 06:54:58
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 06:57:55
*/
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RiwayatPeriksaDAO;
import com.rsia.madura.entity.MRiwayatPeriksa;

@Service
public class RiwayatPeriksaServiceAction implements RiwayatPeriksaService {
	@Autowired
	private RiwayatPeriksaDAO riwayatperiksaDAO;

	@Override
	@Transactional
	public List<MRiwayatPeriksa> getRiwayatPeriksas() {
		// TODO Auto-generated method stub
		return riwayatperiksaDAO.getRiwayatPeriksas();
	}

	@Override
	@Transactional
	public List<MRiwayatPeriksa> getRiwayatPeriksas(int page, int limit) {
		// TODO Auto-generated method stub
		return riwayatperiksaDAO.getRiwayatPeriksas(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return riwayatperiksaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MRiwayatPeriksa getRiwayatPeriksa(int id) {
		// TODO Auto-generated method stub
		return riwayatperiksaDAO.getRiwayatPeriksa(id);
	}

	@Override
	@Transactional
	public int store(MRiwayatPeriksa data) {
		// TODO Auto-generated method stub
		return riwayatperiksaDAO.RiwayatPeriksaStore(data);
	}

	@Override
	@Transactional
	public void update(MRiwayatPeriksa data) {
		// TODO Auto-generated method stub
		riwayatperiksaDAO.RiwayatPeriksaUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MRiwayatPeriksa data) {
		// TODO Auto-generated method stub
		riwayatperiksaDAO.RiwayatPeriksaDelete(data);
	}
}
