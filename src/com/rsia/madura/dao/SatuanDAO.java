/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-16 09:01:00
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 09:01:32
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MSatuan;

public interface SatuanDAO {
	public List<MSatuan> getSatuans();
	public MSatuan getSatuan(int satuanId);
	
	public int satuanStore(MSatuan satuanModel);
	public int satuanUpdate(MSatuan satuanModel);
	public int satuanDelete(MSatuan satuanModel);
}