/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:14:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:17:25
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MDiagnosa9;

public interface Diagnosa9DAO {
	public List<MDiagnosa9> getDiagnosa9s();
	public List<MDiagnosa9> getDiagnosa9s(int page, int limit);
	public String createLinks(int page, int limit);
	public MDiagnosa9 getDiagnosa9(int Diagnosa9Id);
	
	public int Diagnosa9Store(MDiagnosa9 Diagnosa9Model);
	public void Diagnosa9Update(MDiagnosa9 Diagnosa9Model);
	public void Diagnosa9Delete(MDiagnosa9 Diagnosa9Model);
}
