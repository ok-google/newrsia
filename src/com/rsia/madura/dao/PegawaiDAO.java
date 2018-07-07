/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:54:24 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-14 17:54:55
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPegawai;

public interface PegawaiDAO {
	public List<MPegawai> getPegawai();
	public List<MPegawai> getPegawais();
	public List<MPegawai> getPegawais(int page, int limit);
	public String createLinks(int page, int limit);
	public MPegawai getPegawai(int PegawaiId);
	
	public void PegawaiStore(MPegawai PegawaiModel);
	public void PegawaiUpdate(MPegawai PegawaiModel);
	public void PegawaiDelete(MPegawai PegawaiModel);
}
