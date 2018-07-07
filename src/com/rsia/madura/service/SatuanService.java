/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-16 08:58:46
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 09:04:32
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MSatuan;

public interface SatuanService {
	public List<MSatuan> getSatuans();
	public MSatuan getSatuan(int satuanId);
	
	public int store(MSatuan satuanModel);
	public int update(MSatuan satuanModel);
	public int delete(MSatuan satuanModel);
}