/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 15:56:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-15 16:13:08
*/

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MParamPeriksa;

public interface ParamPeriksaDAO {
	public List<MParamPeriksa> getParamPeriksases();
	public List<MParamPeriksa> getParamPeriksases(int page, int limit);
	public String createLinks(int page, int limit);
	public MParamPeriksa getParamPeriksa(int ParamperiksaId);

	public void ParamPeriksaStore(MParamPeriksa paramperiksaModel);
	public void ParamPeriksaUpdate(MParamPeriksa paramperiksaModel);
	public void ParamPeriksaDelete(MParamPeriksa paramperiksaModel);
}