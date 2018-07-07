/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:17:13 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:17:13 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKondisi;

public interface KondisiPasienDAO {
	public List<MKondisi> getKondisis();
	public List<MKondisi> getKondisis(int page, int limit);
	public String createLinks(int page, int limit);
	public MKondisi getKondisi(int kondisiId);
	
	public void kondisiStore(MKondisi kondisiModel);
	public void kondisiUpdate(MKondisi kondisiModel);
	public void kondisiDelete(MKondisi kondisiModel);
}
