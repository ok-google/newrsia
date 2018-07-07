/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:54:12
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 15:55:23
*/

package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PenunjangGroupDAO;
import com.rsia.madura.entity.MPenunjangGroup;

@Service
public class PenunjangGroupServiceAction implements PenunjangGroupService {
	@Autowired
	private PenunjangGroupDAO penunjangGroupDAO;

	@Override
	@Transactional
	public List<MPenunjangGroup> findAll() {
		// TODO Auto-generated method stub
		return this.penunjangGroupDAO.getPenunjangGroups();
	}

	@Override
	@Transactional
	public List<MPenunjangGroup> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangGroupDAO.getPenunjangGroups(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangGroupDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPenunjangGroup getById(int id) {
		// TODO Auto-generated method stub
		return penunjangGroupDAO.getPenunjangGroup(id);
	}

	@Override
	@Transactional
	public void store(MPenunjangGroup data) {
		data.setPmedisgroupAktif("Y");
		penunjangGroupDAO.PenunjangGroupStore(data);
	}

	@Override
	@Transactional
	public void update(MPenunjangGroup data) {
		data.setPmedisgroupAktif("Y");
		penunjangGroupDAO.PenunjangGroupUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPenunjangGroup data) {
		data.setPmedisgroupAktif("T");
		penunjangGroupDAO.PenunjangGroupDelete(data);
	}
}