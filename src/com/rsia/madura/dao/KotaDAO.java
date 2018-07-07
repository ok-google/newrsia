/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:19:15 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:19:15 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKota;


public interface KotaDAO {
	public List<MKota> getKotas(int page, int limit);
	public List<MKota> getKotas();
	public String createLinks(int page, int limit);
	public MKota getKota(int kotaId);
	
	public void kotaStore(MKota kotaModel);
	public void kotaUpdate(MKota kotaModel);
	public void kotaDelete(MKota kotaModel);
}
