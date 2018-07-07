/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 14:14:52
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-27 14:29:07
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MIcd;

public interface IcdService {
	public List<MIcd> findAll();
	public List<MIcd> findAll(int page, int limit);

	public String createLinks(int page, int limit);
	public MIcd getById(int id);
	
	public void store(MIcd data);
	public void update(MIcd data);
	public void delete(MIcd data);
}
