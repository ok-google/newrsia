/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:11:00
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MObat;

public interface ObatService {
	public List<MObat> findAll();
	public List<MObat> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MObat getById(int id);
	
	public void store(MObat data);
	public void update(MObat data);
	public void delete(MObat data);
}