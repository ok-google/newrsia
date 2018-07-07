/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 22:54:32
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-29 05:24:18
*/

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MIcd9;

public interface Icd9DAO {
	public List<MIcd9> getIcd9s();
	public List<MIcd9> getIcd9s(int page, int limit);
	public MIcd9 getIcd9(int id);
	public String createLinks(int page, int limit);
	
	public void icd9Store(MIcd9 icd9Model);
	public void icd9Update(MIcd9 icd9Model);
	public void icd9Delete(MIcd9 icd9Model);
}