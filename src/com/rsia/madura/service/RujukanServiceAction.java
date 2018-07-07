/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:41:48 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:41:48 
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.dao.RujukanDAO;

@Service
public class RujukanServiceAction implements RujukanService {
	@Autowired
	private RujukanDAO rujukanDAO;

	@Override
	@Transactional
	public List<MRujukan> getRujukans() {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukans();
	}

	@Override
	@Transactional
	public List<MRujukan> getRujukans(int page, int limit) {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return rujukanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MRujukan getRujukan(int id) {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukan(id);
	}

	@Override
	@Transactional
	public void store(MRujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(MRujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(MRujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Delete(data);
	}

}
