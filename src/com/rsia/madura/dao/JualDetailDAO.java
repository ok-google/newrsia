package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MJualDetail;

public interface JualDetailDAO {
	public List<MJualDetail> getJualDetails();
	public List<MJualDetail> getJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MJualDetail getJualDetail(int jualDetailId);
	
	public int jualDetailStore(MJualDetail jualDetailModel);
	public int jualDetailUpdate(MJualDetail jualDetailModel);
	public int jualDetailDelete(MJualDetail jualDetailModel);
}
