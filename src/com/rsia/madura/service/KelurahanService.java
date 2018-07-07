/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:30:56 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:31:16
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKelurahan;

public interface KelurahanService {
	public List<MKelurahan> getKelurahans();
	public List<MKelurahan> getKelurahans(int page, int limit);
	public String createLinks(int page, int limit);
	public MKelurahan getKelurahan(int kelurahanId);
	
	public void store(MKelurahan kelurahanModel);
	public void update(MKelurahan kelurahanModel);
	public void delete(MKelurahan kelurahanModel);
}
