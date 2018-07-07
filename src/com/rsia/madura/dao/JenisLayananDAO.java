/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:16:47
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 14:56:26
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MJenisLayanan;

public interface JenisLayananDAO {
	public List<MJenisLayanan> getJenisLayanans();
	public List<MJenisLayanan> getJenisLayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public MJenisLayanan getJenisLayanan(int JenisLayananId);

	public void JenisLayananStore(MJenisLayanan JenisLayananModel);
	public void JenisLayananUpdate(MJenisLayanan JenisLayananModel);
	public void JenisLayananDelete(MJenisLayanan JenisLayananModel);
}