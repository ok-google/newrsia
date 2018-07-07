/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:10:23
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPaketDetail;

public interface PaketDetailService {
	public List<MPaketDetail> findAll();
	public List<MPaketDetail> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketDetail getById(int id);
	
	public void store(MPaketDetail data);
	public void update(MPaketDetail data);
	public void delete(MPaketDetail data);
}