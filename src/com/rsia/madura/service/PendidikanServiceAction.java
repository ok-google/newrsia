/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:39:23 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:58:49
 */
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PendidikanDAO;
import com.rsia.madura.entity.MPendidikan;

@Service
public class PendidikanServiceAction implements PendidikanService{
	@Autowired
	private PendidikanDAO pendidikanDAO;
	
	@Transactional
	@Override
	public List<MPendidikan> getPendidikan(){
		return pendidikanDAO.getPendidikan();
	}
}
