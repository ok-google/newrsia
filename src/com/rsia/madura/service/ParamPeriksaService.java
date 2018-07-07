/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 16:00:34
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-15 16:00:57
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MParamPeriksa;

public interface ParamPeriksaService {
	public List<MParamPeriksa> findAll();
	public List<MParamPeriksa> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MParamPeriksa getById(int id);
	
	public void store(MParamPeriksa data);
	public void update(MParamPeriksa data);
	public void delete(MParamPeriksa data);
}