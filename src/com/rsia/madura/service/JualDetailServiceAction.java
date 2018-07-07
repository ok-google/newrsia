package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JualDetailDAO;
import com.rsia.madura.entity.MJualDetail;

@Service
public class JualDetailServiceAction implements JualDetailService{
	@Autowired
	private JualDetailDAO jualDetailDAO;
	
	@Override
	@Transactional
	public List<MJualDetail> getJualDetails() {

		return jualDetailDAO.getJualDetails();
	}

	@Override
	@Transactional
	public List<MJualDetail> getJualDetails(int page, int limit) {

		return jualDetailDAO.getJualDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return jualDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MJualDetail getJualDetail(int jualDetailId) {

		return jualDetailDAO.getJualDetail(jualDetailId);
	}

	@Override
	@Transactional
	public int store(MJualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailStore(jualDetailModel);
	}

	@Override
	@Transactional
	public int update(MJualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailUpdate(jualDetailModel);
	}

	@Override
	@Transactional
	public int delete(MJualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailDelete(jualDetailModel);
	}

}
