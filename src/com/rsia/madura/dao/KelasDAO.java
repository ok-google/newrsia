/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 01:53:32
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKelas;

public interface KelasDAO {
	public List<MKelas> getKelases();
	public List<MKelas> getKelases(int page, int limit);
	public String createLinks(int page, int limit);
	public MKelas getKelas(int KelasId);

	public void KelasStore(MKelas KelasModel);
	public void KelasUpdate(MKelas KelasModel);
	public void KelasDelete(MKelas KelasModel);
}