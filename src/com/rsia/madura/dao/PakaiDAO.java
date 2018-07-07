/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:15:12
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:18:58
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPakai;

public interface PakaiDAO {
	public List<MPakai> getPakais();
	public List<MPakai> getPakais(int page, int limit);
	public String createLinks(int page, int limit);
	public MPakai getPakai(int PakaiId);
	
	public int PakaiStore(MPakai PakaiModel);
	public void PakaiUpdate(MPakai PakaiModel);
	public void PakaiDelete(MPakai PakaiModel);
}
