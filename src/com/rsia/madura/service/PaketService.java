/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:10:23
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPaket;

public interface PaketService {
	public List<MPaket> findAll();
	public List<MPaket> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaket getById(int id);
	
	public void store(MPaket data);
	public void update(MPaket data);
	public void delete(MPaket data);
}