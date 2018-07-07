/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 05:13:30
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKelas;

public interface KelasService {
	public List<MKelas> findAll();
	public List<MKelas> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MKelas getById(int id);
	
	public void store(MKelas data);
	public void update(MKelas data);
	public void delete(MKelas data);
}