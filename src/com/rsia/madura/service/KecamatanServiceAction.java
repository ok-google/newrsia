/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:29:53 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:29:53 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KecamatanDAO;
import com.rsia.madura.entity.MKecamatan;

@Service
public class KecamatanServiceAction implements KecamatanService {
	@Autowired
	private KecamatanDAO kecamatanDAO;
	
	@Transactional
	@Override
	public List<MKecamatan> getKecamatans() {
		return kecamatanDAO.getKecamatans();
	}
	
	@Override
	@Transactional
	public List<MKecamatan> getKecamatans(int page, int limit){
		return kecamatanDAO.getKecamatans(page, limit);
	}
	
	@Override
	public String createLinks(int page, int limit) {
		return kecamatanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MKecamatan getKecamatan(int kecamatanId) {
		
		return kecamatanDAO.getKecamatan(kecamatanId);
	}

	@Override
	@Transactional
	public void store(MKecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanStore(kecamatanModel);
		
	}

	@Override
	@Transactional
	public void update(MKecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanUpdate(kecamatanModel);
		
	}

	@Override
	@Transactional
	public void delete(MKecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanDelete(kecamatanModel);
		
	}

}
