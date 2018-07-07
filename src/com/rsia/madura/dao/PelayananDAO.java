/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 10:01:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-26 13:49:22
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPendaftaran;

public interface PelayananDAO {
	public List<MPendaftaran> getPelayanans();
	public List<MPendaftaran> getPelayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPendaftaran getPelayanan(int PelayananId);
	
	public void update(MPendaftaran PelayananModel);
	public void delete(MPendaftaran PelayananModel);
}