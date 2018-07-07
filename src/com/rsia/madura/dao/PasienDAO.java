/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:54:24 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-14 17:54:55
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPasien;

public interface PasienDAO {
	public List<MPasien> getPasien();
	public List<MPasien> getPasiens();
	public List<MPasien> getPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MPasien getPasien(int PasienId);
	
	public void PasienStore(MPasien PasienModel);
	public void PasienUpdate(MPasien PasienModel);
	public void PasienDelete(MPasien PasienModel);
}
