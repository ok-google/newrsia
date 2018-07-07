/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:28:01 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 14:00:43
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JabatanDAO;
import com.rsia.madura.entity.MJabatan;

@Service
public class JabatanServiceAction implements JabatanService {
	@Autowired
	private JabatanDAO jabatanDAO;
	
	@Override
	@Transactional
	public List<MJabatan> getJabatans() {
		
		return jabatanDAO.getJabatans();
	}

	@Override
	@Transactional
	public MJabatan getJabatan(int jabatanId) {
		
		return jabatanDAO.getJabatan(jabatanId);
	}

	@Override
	@Transactional
	public void store(MJabatan jabatanModel) {
		
		jabatanDAO.jabatanStore(jabatanModel);

	}

	@Override
	@Transactional
	public void update(MJabatan jabatanModel) {
		
		jabatanDAO.jabatanUpdate(jabatanModel);

	}

	@Override
	@Transactional
	public void delete(MJabatan jabatanModel) {
		
		jabatanDAO.jabatanDelete(jabatanModel);

	}

}
