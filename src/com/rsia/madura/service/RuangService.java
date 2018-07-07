/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 10:57:42
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MRuang;

public interface RuangService {
	public List<MRuang> findAll();
	public List<MRuang> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MRuang getById(int id);
	
	public void store(MRuang data);
	public void update(MRuang data);
	public void delete(MRuang data);
}