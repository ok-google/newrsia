package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.AgamaDAO;
import com.rsia.madura.entity.MAgama;

@Service
public class AgamaServiceAction implements AgamaService {
	@Autowired
	private AgamaDAO agamaDAO;

	@Override
	@Transactional
	public List<MAgama> getAgamas() {
		// TODO Auto-generated method stub
		return agamaDAO.getAgamas();
	}

	@Override
	@Transactional
	public List<MAgama> getAgamas(int page, int limit) {
		// TODO Auto-generated method stub
		return agamaDAO.getAgamas(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return agamaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MAgama getAgama(int id) {
		// TODO Auto-generated method stub
		return agamaDAO.getAgama(id);
	}

	@Override
	@Transactional
	public int store(MAgama data) {
		// TODO Auto-generated method stub
		return agamaDAO.AgamaStore(data);
	}

	@Override
	@Transactional
	public void update(MAgama data) {
		// TODO Auto-generated method stub
		agamaDAO.AgamaUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MAgama data) {
		// TODO Auto-generated method stub
		agamaDAO.AgamaDelete(data);
	}
}
