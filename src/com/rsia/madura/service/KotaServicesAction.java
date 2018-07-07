/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:35:11 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:35:11 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KotaDAO;
import com.rsia.madura.entity.MKota;

@Service
public class KotaServicesAction implements KotaService{
	@Autowired
	private KotaDAO kotaDAO;
	
	@Override
	@Transactional
	public List<MKota> getKotas(int page, int limit) {
		
		return kotaDAO.getKotas(page, limit);
	}
	
	@Override
	@Transactional
	public List<MKota> getKotas() {
		
		return kotaDAO.getKotas();
	}
	
	public String createLinks(int page, int limit) {
		return kotaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MKota getKota(int kotaId) {
		
		return kotaDAO.getKota(kotaId);
	}

	@Override
	@Transactional
	public void store(MKota kotaModel) {
		
		kotaDAO.kotaStore(kotaModel);
	}

	@Override
	@Transactional
	public void update(MKota kotaModel) {
		
		kotaDAO.kotaUpdate(kotaModel);
		
	}

	@Override
	@Transactional
	public void delete(MKota kotaModel) {
		
		kotaDAO.kotaDelete(kotaModel);
		
	}
}
