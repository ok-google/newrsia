/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:25:28 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:25:28 
 */
package com.rsia.madura.dao;

import java.util.List;
import com.rsia.madura.entity.MProvinsi;

public interface ProvinsiDAO {
	public List<MProvinsi> getProvinsis();
	public List<MProvinsi> getProvinsis(int page, int limit);
	public String createLinks(int page, int limit);
	public MProvinsi getProvinsi(int provinsiId);
	
	public void provinsiStore(MProvinsi provinsiModel);
	public void provinsiUpdate(MProvinsi provinsiModel);
	public void provinsiDelete(MProvinsi provinsiModel);
	
}
