/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:45:52
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 15:51:20
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPenunjangGroup;

public interface PenunjangGroupDAO {
	public List<MPenunjangGroup> getPenunjangGroups();
	public List<MPenunjangGroup> getPenunjangGroups(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjangGroup getPenunjangGroup(int PenunjangGroupId);

	public void PenunjangGroupStore(MPenunjangGroup penunjangModel);
	public void PenunjangGroupUpdate(MPenunjangGroup penunjangModel);
	public void PenunjangGroupDelete(MPenunjangGroup penunjangModel);
}