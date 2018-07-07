/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:16:23
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:20:02
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MSoap;

public interface SoapDAO {
	public List<MSoap> getSoaps();
	public List<MSoap> getSoaps(int page, int limit);
	public String createLinks(int page, int limit);
	public MSoap getSoap(int SoapId);
	
	public int SoapStore(MSoap SoapModel);
	public void SoapUpdate(MSoap SoapModel);
	public void SoapDelete(MSoap SoapModel);
}
