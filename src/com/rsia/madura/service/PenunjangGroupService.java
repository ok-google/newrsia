/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:53:18
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 15:53:52
*/

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPenunjangGroup;

public interface PenunjangGroupService {
	public List<MPenunjangGroup> findAll();
	public List<MPenunjangGroup> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjangGroup getById(int id);
	
	public void store(MPenunjangGroup data);
	public void update(MPenunjangGroup data);
	public void delete(MPenunjangGroup data);
}