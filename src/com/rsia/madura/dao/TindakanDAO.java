/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:14:16
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTindakan;

public interface TindakanDAO {
	public List<MTindakan> getTindakans();
	public List<MTindakan> getTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public MTindakan getTindakan(int TindakanId);

	public void TindakanStore(MTindakan TindakanModel);
	public void TindakanUpdate(MTindakan TindakanModel);
	public void TindakanDelete(MTindakan TindakanModel);
}