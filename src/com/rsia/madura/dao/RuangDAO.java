/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:07:28
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MRuang;

public interface RuangDAO {
	public List<MRuang> getRuangs();
	public List<MRuang> getRuangs(int page, int limit);
	public String createLinks(int page, int limit);
	public MRuang getRuang(int RuangId);

	public void RuangStore(MRuang RuangModel);
	public void RuangUpdate(MRuang RuangModel);
	public void RuangDelete(MRuang RuangModel);
}