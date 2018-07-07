/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:14:49
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:18:48
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTindakanPasien;

public interface TindakanPasienDAO {
	public List<MTindakanPasien> getTindakanPasiens();
	public List<MTindakanPasien> getTindakanPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MTindakanPasien getTindakanPasien(int TindakanPasienId);
	
	public int TindakanPasienStore(MTindakanPasien TindakanPasienModel);
	public void TindakanPasienUpdate(MTindakanPasien TindakanPasienModel);
	public void TindakanPasienDelete(MTindakanPasien TindakanPasienModel);
}
