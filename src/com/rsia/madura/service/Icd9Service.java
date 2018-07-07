/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 22:52:30
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-28 22:52:57
*/

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MIcd9;

public interface Icd9Service {
	public List<MIcd9> findAll();
	public List<MIcd9> findAll(int page, int limit);

	public String createLinks(int page, int limit);
	public MIcd9 getById(int id);
	
	public void store(MIcd9 data);
	public void update(MIcd9 data);
	public void delete(MIcd9 data);
}
