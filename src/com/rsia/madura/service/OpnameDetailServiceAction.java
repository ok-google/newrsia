package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OpnameDetailDAO;
import com.rsia.madura.entity.MOpnameDetail;

@Service
public class OpnameDetailServiceAction implements OpnameDetailService {
	@Autowired
	private OpnameDetailDAO opnameDetailDAO;
	
	@Override
	@Transactional
	public List<MOpnameDetail> getOpnameDetails() {

		return opnameDetailDAO.getOpnameDetails();
	}

	@Override
	@Transactional
	public List<MOpnameDetail> getOpnameDetails(int page, int limit) {

		return opnameDetailDAO.getOpnameDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return opnameDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MOpnameDetail getOpnameDetail(int opnameDetailId) {

		return opnameDetailDAO.getOpnameDetail(opnameDetailId);
	}

	@Override
	@Transactional
	public int store(MOpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailStore(opnameDetailModel);
	}

	@Override
	@Transactional
	public int update(MOpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailUpdate(opnameDetailModel);
	}

	@Override
	@Transactional
	public int delete(MOpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailDelete(opnameDetailModel);
	}

}
