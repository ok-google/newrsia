package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TerapiPasienDAO;
import com.rsia.madura.entity.MTerapiPasien;

@Service
public class TerapiPasienServiceAction implements TerapiPasienService {
	@Autowired
	private TerapiPasienDAO terapiDAO;

	@Override
	@Transactional
	public List<MTerapiPasien> findAll() {
		// TODO Auto-generated method stub
		return terapiDAO.getTerapiPasiens();
	}

	@Override
	@Transactional
	public List<MTerapiPasien> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return terapiDAO.getTerapiPasiens(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return terapiDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MTerapiPasien getById(int id) {
		// TODO Auto-generated method stub
		return terapiDAO.getTerapiPasien(id);
	}

	@Override
	@Transactional
	public void store(MTerapiPasien data) {
		// TODO Auto-generated method stub
		terapiDAO.TerapiPasienStore(data);
	}

	@Override
	@Transactional
	public void update(MTerapiPasien data) {
		// TODO Auto-generated method stub
		terapiDAO.TerapiPasienUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MTerapiPasien data) {
		// TODO Auto-generated method stub
		terapiDAO.TerapiPasienDelete(data);
	}
}
