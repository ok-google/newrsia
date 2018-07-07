/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:31:52 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:31:52 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KelurahanDAO;
import com.rsia.madura.entity.MKelurahan;

@Service
public class KelurahanServiceAction implements KelurahanService{
	
	@Autowired
	private KelurahanDAO kelurahanDAO;
	
	@Override
	@Transactional
	public List<MKelurahan> getKelurahans() {
		return kelurahanDAO.getKelurahans();
	}
	@Override
	@Transactional
	public List<MKelurahan> getKelurahans(int page, int limit){
		return kelurahanDAO.getKelurahans(page, limit);
	}
	
	@Override
	public String createLinks(int page, int limit) {
		return kelurahanDAO.createLinks(page, limit);
	}
	
	@Override
	@Transactional
	public MKelurahan getKelurahan(int kelurahanId) {
		
		return kelurahanDAO.getKelurahan(kelurahanId);
	}
	@Override
	@Transactional
	public void store(MKelurahan kelurahanModel) {
		kelurahanDAO.kelurahanStore(kelurahanModel);
		
	}
	@Override
	@Transactional
	public void update(MKelurahan kelurahanModel) {
		kelurahanDAO.kelurahanUpdate(kelurahanModel);
		
	}
	@Override
	@Transactional
	public void delete(MKelurahan kelurahanModel) {
		kelurahanDAO.kelurahanDelete(kelurahanModel);
		
	}
}
