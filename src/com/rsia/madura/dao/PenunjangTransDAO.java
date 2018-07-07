/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:16:02
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:19:29
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPenunjangTrans;

public interface PenunjangTransDAO {
	public List<MPenunjangTrans> getPenunjangTranss();
	public List<MPenunjangTrans> getPenunjangTranss(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjangTrans getPenunjangTrans(int PenunjangTransId);
	
	public int PenunjangTransStore(MPenunjangTrans PenunjangTransModel);
	public void PenunjangTransUpdate(MPenunjangTrans PenunjangTransModel);
	public void PenunjangTransDelete(MPenunjangTrans PenunjangTransModel);
}
