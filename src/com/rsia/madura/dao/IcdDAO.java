/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 14:01:38
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-27 14:07:10
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MIcd;

public interface IcdDAO {
	public List<MIcd> getIcds();
	public List<MIcd> getIcds(int page, int limit);
	public MIcd getIcd(int id);
	public String createLinks(int page, int limit);
	
	public void icdStore(MIcd icdModel);
	public void icdUpdate(MIcd icdModel);
	public void icdDelete(MIcd icdModel);
}