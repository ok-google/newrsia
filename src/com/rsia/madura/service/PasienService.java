/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:38:07 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-24 12:38:08
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPasien;

public interface PasienService {
	public List<MPasien> findAll();
	public List<MPasien> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPasien getById(int id);
	
	public void store(MPasien data);
	public void update(MPasien data);
	public void delete(MPasien data);
}
