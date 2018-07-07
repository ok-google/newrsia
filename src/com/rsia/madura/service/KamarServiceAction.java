package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KamarDAO;
import com.rsia.madura.entity.MKamar;

@Service
public class KamarServiceAction implements KamarService{
	@Autowired
	private KamarDAO kamarDAO;

	@Override
	@Transactional
	public List<MKamar> findAll() {
		// TODO Auto-generated method stub
		return this.kamarDAO.getKamars();
	}

	@Override
	@Transactional
	public List<MKamar> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return this.kamarDAO.getKamars(page, limit);
	}
	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return kamarDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MKamar getKamar(int id) {
		// TODO Auto-generated method stub
		return kamarDAO.getKamar(id);
	}

	@Override
	@Transactional
	public void store(MKamar data) {
		// TODO Auto-generated method stub
		kamarDAO.Store(data);
		
	}

	@Override
	@Transactional
	public void update(MKamar data) {
		// TODO Auto-generated method stub
		kamarDAO.Update(data);
		
	}

	@Override
	@Transactional
	public void delete(MKamar data) {
		// TODO Auto-generated method stub
		kamarDAO.Delete(data);
	}

}
