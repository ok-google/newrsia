/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:25:10 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:25:10 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MRujukan;

public interface RujukanDAO {
	public List<MRujukan> getRujukans();
	public List<MRujukan> getRujukans(int page, int limit);
	public String createLinks(int page, int limit);
	public MRujukan getRujukan(int RujukanId);
	
	public void Store(MRujukan Model);
	public void Update(MRujukan Model);
	public void Delete(MRujukan Model);
}
