/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:10:19
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MObat;

public interface ObatDAO {
	public List<MObat> getObats();
	public List<MObat> getObats(int page, int limit);
	public String createLinks(int page, int limit);
	public MObat getObat(int ObatId);

	public void ObatStore(MObat ObatModel);
	public void ObatUpdate(MObat ObatModel);
	public void ObatDelete(MObat ObatModel);
}