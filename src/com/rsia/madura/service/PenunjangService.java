/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 05:13:30
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPenunjang;

public interface PenunjangService {
	public List<MPenunjang> findAll();
	public List<MPenunjang> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjang getById(int id);
	
	public void store(MPenunjang data);
	public void update(MPenunjang data);
	public void delete(MPenunjang data);
}