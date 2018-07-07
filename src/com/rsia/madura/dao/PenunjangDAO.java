/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 15:51:55
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPenunjang;

public interface PenunjangDAO {
	public List<MPenunjang> getPenunjangs();
	public List<MPenunjang> getPenunjangs(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjang getPenunjang(int PenunjangId);

	public void PenunjangStore(MPenunjang penunjangModel);
	public void PenunjangUpdate(MPenunjang penunjangModel);
	public void PenunjangDelete(MPenunjang penunjangModel);
}