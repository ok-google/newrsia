/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:15:12
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:18:58
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTerapiPasien;

public interface TerapiPasienDAO {
	public List<MTerapiPasien> getTerapiPasiens();
	public List<MTerapiPasien> getTerapiPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerapiPasien getTerapiPasien(int TerapiPasienId);
	
	public int TerapiPasienStore(MTerapiPasien TerapiPasienModel);
	public void TerapiPasienUpdate(MTerapiPasien TerapiPasienModel);
	public void TerapiPasienDelete(MTerapiPasien TerapiPasienModel);
}
