/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:34:04 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:34:04 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.dao.KondisiPasienDAO;

@Service

public class KondisiPasienServiceAction implements KondisiPasienService {
	@Autowired
	private KondisiPasienDAO kondisiPasienDAO;

	@Override
	@Transactional
	public List<MKondisi> getKondisis() {
		// TODO Auto-generated method stub
		return kondisiPasienDAO.getKondisis();
	}

	@Override
	@Transactional
	public List<MKondisi> getKondisis(int page, int limit) {
		// TODO Auto-generated method stub
		return kondisiPasienDAO.getKondisis(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return kondisiPasienDAO.createLinks(page, limit);
	}
	
	@Override
	@Transactional
	public MKondisi getKondisi(int kondisiId) {
		return kondisiPasienDAO.getKondisi(kondisiId);
	}
	
	@Override
	@Transactional
	public void store(MKondisi kondisiModel) {
		kondisiPasienDAO.kondisiStore(kondisiModel);
	}

	@Override
	@Transactional
	public void update(MKondisi kondisiModel) {
		kondisiPasienDAO.kondisiUpdate(kondisiModel);

	}

	@Override
	@Transactional
	public void delete(MKondisi kondisiModel) {
		kondisiPasienDAO.kondisiDelete(kondisiModel);
	}

}
