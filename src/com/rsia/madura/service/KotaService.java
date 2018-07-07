/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:34:13 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:34:13 
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKota;

public interface KotaService {
	public List<MKota> getKotas(int page, int limit);
	public List<MKota> getKotas();
	public String createLinks(int page, int limit);
	public MKota getKota(int kotaId);
	
	public void store(MKota kotaModel);
	public void update(MKota kotaModel);
	public void delete(MKota kotaModel);
}
