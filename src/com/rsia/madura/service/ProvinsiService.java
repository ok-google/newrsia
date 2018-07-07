/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:39:41 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:39:41 
 */
package com.rsia.madura.service;

import java.util.List;
import com.rsia.madura.entity.MProvinsi;

public interface ProvinsiService {
	public List<MProvinsi> getProvinsis();
	public List<MProvinsi> getProvinsis(int page, int limit);
	public String createLinks(int page, int limit);
	public MProvinsi getProvinsi(int provinsiId);
	
	public void store(MProvinsi provinsiModel);
	public void update(MProvinsi provinsiModel);
	public void delete(MProvinsi provinsiModel);
	
}
