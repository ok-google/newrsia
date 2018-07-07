/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:32:06 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:32:06 
 */
package com.rsia.madura.service;

import java.util.List;
import com.rsia.madura.entity.MKondisi;

public interface KondisiPasienService {
	public List<MKondisi> getKondisis();
	public List<MKondisi> getKondisis(int page, int limit);
	public String createLinks(int page, int limit);
	public MKondisi getKondisi(int kondisiId);
	
	public void store(MKondisi kondisiModel);
	public void update(MKondisi kondisiModel);
	public void delete(MKondisi kondisiModel);
}
