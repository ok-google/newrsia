package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.StokObatDAO;
import com.rsia.madura.entity.MStokObat;

@Service
public class StokObatServiceAction implements StokObatService {
	@Autowired
	private StokObatDAO stokObatDAO;
	
	@Override
	@Transactional
	public List<MStokObat> getStokObats() {
		
		return stokObatDAO.getStokObats();
	}

	@Override
	@Transactional
	public List<MStokObat> getStokObats(int page, int limit) {

		return stokObatDAO.getStokObats(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return stokObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MStokObat getStokObat(int stokObatId) {
		
		return stokObatDAO.getStokObat(stokObatId);
	}

	@Override
	@Transactional
	public int stokObatStore(MStokObat stokObatModel) {
		
		return stokObatDAO.stokObatStore(stokObatModel);

	}

	@Override
	@Transactional
	public int stokObatUpdate(MStokObat stokObatModel) {
		
		return stokObatDAO.stokObatUpdate(stokObatModel);

	}

	@Override
	@Transactional
	public int stokObatDelete(MStokObat stokObatModel) {
		
		return stokObatDAO.stokObatDelete(stokObatModel);

	}

}
