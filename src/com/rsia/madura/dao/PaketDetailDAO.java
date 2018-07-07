/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:16:47
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaketDetail;

public interface PaketDetailDAO {
	public List<MPaketDetail> getPaketDetails();
	public List<MPaketDetail> getPaketDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketDetail getPaketDetail(int PaketId);
	
	public void PaketDetailStore(MPaketDetail PaketDetailModel);
	public void PaketDetailUpdate(MPaketDetail PaketDetailModel);
	public void PaketDetailDelete(MPaketDetail PaketDetailModel);
}