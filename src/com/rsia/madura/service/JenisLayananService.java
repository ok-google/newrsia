/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:22:42
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 14:57:07
*/

package com.rsia.madura.service;
import java.util.List;

import com.rsia.madura.entity.MJenisLayanan;

public interface JenisLayananService {
	public List<MJenisLayanan> findAll();
	public List<MJenisLayanan> findAll(int page, int limit);

	public String createLinks(int page, int limit);
	public MJenisLayanan getJenisLayanan(int id);
	
	public void store(MJenisLayanan data);
	public void update(MJenisLayanan data);
	public void delete(MJenisLayanan data);
}