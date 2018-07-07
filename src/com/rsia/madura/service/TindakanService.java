/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 09:36:45
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MTindakan;

public interface TindakanService {
	public List<MTindakan> findAll();
	public List<MTindakan> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MTindakan getById(int id);
	
	public void store(MTindakan data);
	public void update(MTindakan data);
	public void delete(MTindakan data);
}