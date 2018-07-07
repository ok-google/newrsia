/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-16 08:59:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 09:00:06
*/
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.SatuanDAO;
import com.rsia.madura.entity.MSatuan;

@Service
public class SatuanServiceAction implements SatuanService {
	@Autowired
	private SatuanDAO satuanDAO;
	
	@Override
	@Transactional
	public List<MSatuan> getSatuans() {
		
		return satuanDAO.getSatuans();
	}

	@Override
	@Transactional
	public MSatuan getSatuan(int satuanId) {
		
		return satuanDAO.getSatuan(satuanId);
	}

	@Override
	@Transactional
	public int store(MSatuan satuanModel) {
		
		return satuanDAO.satuanStore(satuanModel);
		
	}

	@Override
	@Transactional
	public int update(MSatuan satuanModel) {
		
		return satuanDAO.satuanUpdate(satuanModel);
	}

	@Override
	@Transactional
	public int delete(MSatuan satuanModel) {
		
		return satuanDAO.satuanDelete(satuanModel);
	}

}