package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TerimaDetailDAO;
import com.rsia.madura.entity.MTerimaDetail;

@Service
public class TerimaDetailServiceAction implements TerimaDetailService {
	@Autowired
	private TerimaDetailDAO terimaDetailDAO;
	
	@Override
	@Transactional
	public List<MTerimaDetail> getTerimaDetails() {

		return terimaDetailDAO.getTerimaDetails();
	}

	@Override
	@Transactional
	public List<MTerimaDetail> getTerimaDetails(int page, int limit) {

		return terimaDetailDAO.getTerimaDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return terimaDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MTerimaDetail getTerimaDetail(int terimaDetailId) {

		return terimaDetailDAO.getTerimaDetail(terimaDetailId);
	}

	@Override
	@Transactional
	public int store(MTerimaDetail terimaDetailModel) {

		return terimaDetailDAO.terimaDetailStore(terimaDetailModel);
	}

	@Override
	@Transactional
	public int update(MTerimaDetail terimaDetailModel) {

		return terimaDetailDAO.terimaDetailUpdate(terimaDetailModel);
	}

	@Override
	@Transactional
	public int delete(MTerimaDetail terimaDetailModel) {

		return terimaDetailDAO.terimaDetailDelete(terimaDetailModel);
	}

}
