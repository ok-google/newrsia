/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:16:47
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaket;

public interface PaketDAO {
	public List<MPaket> getPakets();
	public List<MPaket> getPakets(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaket getPaket(int PaketId);

	public void PaketStore(MPaket PaketModel);
	public void PaketUpdate(MPaket PaketModel);
	public void PaketDelete(MPaket PaketModel);
}