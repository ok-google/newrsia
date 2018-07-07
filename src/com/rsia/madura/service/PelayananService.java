/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 09:57:47
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-26 13:53:44
*/

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPendaftaran;

public interface PelayananService {
	public List<MPendaftaran> getPelayanans();
	public List<MPendaftaran> getPelayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPendaftaran getPelayanan(int id);
	
	public void update(MPendaftaran data);
	public void delete(MPendaftaran data);
}