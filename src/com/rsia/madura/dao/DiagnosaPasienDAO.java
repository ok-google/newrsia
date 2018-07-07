/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:04:56
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:07:11
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MDiagnosaPasien;

public interface DiagnosaPasienDAO {
	public List<MDiagnosaPasien> getDiagnosaPasiens();
	public List<MDiagnosaPasien> getDiagnosaPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MDiagnosaPasien getDiagnosaPasien(int DiagnosaPasienId);
	
	public int DiagnosaPasienStore(MDiagnosaPasien DiagnosaPasienModel);
	public void DiagnosaPasienUpdate(MDiagnosaPasien DiagnosaPasienModel);
	public void DiagnosaPasienDelete(MDiagnosaPasien DiagnosaPasienModel);
}
