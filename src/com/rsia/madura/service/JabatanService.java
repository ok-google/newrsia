/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:27:06 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:58:30
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MJabatan;

public interface JabatanService {
	public List<MJabatan> getJabatans();
	public MJabatan getJabatan(int jabatanId);
	
	public void store(MJabatan jabatanModel);
	public void update(MJabatan jabatanModel);
	public void delete(MJabatan jabatanModel);
}
