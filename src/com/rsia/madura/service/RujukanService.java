/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:41:01 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:41:01 
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MRujukan;

public interface RujukanService {
	public List<MRujukan> getRujukans();
	public List<MRujukan> getRujukans(int page, int limit);
	public String createLinks(int page, int limit);
	public MRujukan getRujukan(int id);
	
	public void store(MRujukan data);
	public void update(MRujukan data);
	public void delete(MRujukan data);
}
