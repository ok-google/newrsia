package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ReturJualDAO;
import com.rsia.madura.entity.MReturJual;

@Service
public class ReturJualServiceAction implements ReturJualService {
	@Autowired
	private ReturJualDAO returJualDAO;
	
	@Override
	@Transactional
	public List<MReturJual> getReturJuals() {
		
		return returJualDAO.getReturJuals();
	}

	@Override
	@Transactional
	public List<MReturJual> getReturJuals(int page, int limit) {
		
		return returJualDAO.getReturJuals(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return returJualDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MReturJual getReturJual(int returJualId) {
		
		return returJualDAO.getReturJual(returJualId);
	}

	@Override
	@Transactional
	public int store(MReturJual returJualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(returJualModel.getDetail() != null) {
			returJualModel.getDetail().forEach((detail) ->{
				detail.setReturJual(returJualModel);
				detail.setReturJualDetailCreatedBy("Admin");
				detail.setReturJualDetailCreatedDate(currentTime);
			});
		}
		
		return returJualDAO.returJualStore(returJualModel);
	}

	@Override
	@Transactional
	public int update(MReturJual returJualModel) {
		
		return returJualDAO.returJualUpdate(returJualModel);
	}

	@Override
	@Transactional
	public int delete(MReturJual returJualModel) {
		
		return returJualDAO.returJualDelete(returJualModel);
	}

}
