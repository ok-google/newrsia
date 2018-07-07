package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ReturJualDetailDAO;
import com.rsia.madura.entity.MReturJualDetail;

@Service
public class ReturJualDetailServiceAction implements ReturJualDetailService {
	@Autowired
	private ReturJualDetailDAO ReturJualDetailDAO;
	
	@Override
	@Transactional
	public List<MReturJualDetail> getReturJualDetails() {
		
		return ReturJualDetailDAO.getReturJualDetails();
	}

	@Override
	@Transactional
	public List<MReturJualDetail> getReturJualDetails(int page, int limit) {
		
		return ReturJualDetailDAO.getReturJualDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return ReturJualDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MReturJualDetail getReturJualDetail(int ReturJualDetailId) {
		
		return ReturJualDetailDAO.getReturJualDetail(ReturJualDetailId);
	}

	@Override
	@Transactional
	public int store(MReturJualDetail ReturJualDetailModel) {
		
		return ReturJualDetailDAO.ReturJualDetailStore(ReturJualDetailModel);
	}

	@Override
	@Transactional
	public int update(MReturJualDetail ReturJualDetailModel) {
		
		return ReturJualDetailDAO.ReturJualDetailUpdate(ReturJualDetailModel);
	}

	@Override
	@Transactional
	public int delete(MReturJualDetail ReturJualDetailModel) {
		
		return ReturJualDetailDAO.ReturJualDetailDelete(ReturJualDetailModel);
	}

}
