/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 06:54:44
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 06:56:25
*/
package com.rsia.madura.service;

import java.util.List;
 
import com.rsia.madura.entity.MRiwayatPeriksa;

public interface RiwayatPeriksaService {	
	public List<MRiwayatPeriksa> getRiwayatPeriksas();
	public List<MRiwayatPeriksa> getRiwayatPeriksas(int page, int limit);
	public String createLinks(int page, int limit);
	public MRiwayatPeriksa getRiwayatPeriksa(int id);
	
	public int store(MRiwayatPeriksa data);
	public void update(MRiwayatPeriksa data);
	public void delete(MRiwayatPeriksa data);
}
