/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:14:22 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:14:22 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKecamatan;

public interface KecamatanDAO {
	public List<MKecamatan> getKecamatans();
	public List<MKecamatan> getKecamatans(int page, int limit);
	public String createLinks(int page, int limit);
	public MKecamatan getKecamatan(int kecamatanId);
	
	public void kecamatanStore(MKecamatan kecamatanModel);
	public void kecamatanUpdate(MKecamatan kecamatanModel);
	public void kecamatanDelete(MKecamatan kecamatanModel);
	
}
