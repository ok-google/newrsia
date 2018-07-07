/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:28:54 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:29:15
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKecamatan;

public interface KecamatanService {
	public List<MKecamatan> getKecamatans();
	public List<MKecamatan> getKecamatans(int page, int limit);
	public String createLinks(int page, int limit);
	public MKecamatan getKecamatan(int kecamatanId);
	
	public void store(MKecamatan kecamatanModel);
	public void update(MKecamatan kecamatanModel);
	public void delete(MKecamatan kecamatanModel);
}
