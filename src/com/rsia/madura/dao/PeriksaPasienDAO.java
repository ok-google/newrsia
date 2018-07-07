/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:04:02
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:06:33
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPeriksaPasien;

public interface PeriksaPasienDAO {
	public List<MPeriksaPasien> getPeriksaPasiens();
	public List<MPeriksaPasien> getPeriksaPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MPeriksaPasien getPeriksaPasien(int PeriksaPasienId);
	
	public int PeriksaPasienStore(MPeriksaPasien PeriksaPasienModel);
	public void PeriksaPasienUpdate(MPeriksaPasien PeriksaPasienModel);
	public void PeriksaPasienDelete(MPeriksaPasien PeriksaPasienModel);
}
