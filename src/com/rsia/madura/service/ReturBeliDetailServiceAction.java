package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ReturBeliDetailDAO;
import com.rsia.madura.entity.MReturBeliDetail;

@Service
public class ReturBeliDetailServiceAction implements ReturBeliDetailService {
	@Autowired
	private ReturBeliDetailDAO ReturBeliDetailDAO;
	
	@Override
	@Transactional
	public List<MReturBeliDetail> getReturBeliDetails() {
		
		return ReturBeliDetailDAO.getReturBeliDetails();
	}

	@Override
	@Transactional
	public List<MReturBeliDetail> getReturBeliDetails(int page, int limit) {
		
		return ReturBeliDetailDAO.getReturBeliDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return ReturBeliDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MReturBeliDetail getReturBeliDetail(int ReturBeliDetailId) {
		
		return ReturBeliDetailDAO.getReturBeliDetail(ReturBeliDetailId);
	}

	@Override
	@Transactional
	public List<MReturBeliDetail> where(String column, String value) {
		
		return ReturBeliDetailDAO.where(column, value);
	}

	@Override
	@Transactional
	public int store(MReturBeliDetail ReturBeliDetailModel) {
		
		return ReturBeliDetailDAO.ReturBeliDetailStore(ReturBeliDetailModel);
	}

	@Override
	@Transactional
	public int update(MReturBeliDetail ReturBeliDetailModel) {
		
		return ReturBeliDetailDAO.ReturBeliDetailUpdate(ReturBeliDetailModel);
	}

	@Override
	@Transactional
	public int delete(MReturBeliDetail ReturBeliDetailModel) {
		
		return ReturBeliDetailDAO.ReturBeliDetailDelete(ReturBeliDetailModel);
	}

}
