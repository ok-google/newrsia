/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:12:27 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:12:27 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MJabatan;

public interface JabatanDAO {
	public List<MJabatan> getJabatans();
	public MJabatan getJabatan(int jabatanId);
	
	public void jabatanStore(MJabatan jabatanModel);
	public void jabatanUpdate(MJabatan jabatanModel);
	public void jabatanDelete(MJabatan jabatanModel);
}
