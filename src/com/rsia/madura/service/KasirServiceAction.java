package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KasirDAO;
import com.rsia.madura.entity.MKasir;

@Service
public class KasirServiceAction implements KasirService {
	@Autowired
	private KasirDAO kasirDAO;

	@Override
	@Transactional
	public List<MKasir> getKasirs() {
		// TODO Auto-generated method stub
		return kasirDAO.getKasirs();
	}

	@Override
	@Transactional
	public List<MKasir> getKasirs(int page, int limit) {
		// TODO Auto-generated method stub
		return kasirDAO.getKasirs(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return kasirDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MKasir getKasir(int id) {
		// TODO Auto-generated method stub
		return kasirDAO.getKasir(id);
	}

	@Override
	@Transactional
	public int store(MKasir data) {
		// TODO Auto-generated method stub
		return kasirDAO.KasirStore(data);
	}

	@Override
	@Transactional
	public void update(MKasir data) {
		// TODO Auto-generated method stub
		kasirDAO.KasirUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MKasir data) {
		// TODO Auto-generated method stub
		kasirDAO.KasirDelete(data);
	}
}
