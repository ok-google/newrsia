/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:38:07 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:38:07 
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPegawai;

public interface PegawaiService {
	public List<MPegawai> getPegawai();
	public List<MPegawai> getPegawais(int page, int limit);
	public String createLinks(int page, int limit);
	public MPegawai getPegawai(int id);
	
	public void store(MPegawai data);
	public void update(MPegawai data);
	public void delete(MPegawai data);
}
