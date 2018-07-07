package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MJualDetail;

public interface JualDetailService {
	public List<MJualDetail> getJualDetails();
	public List<MJualDetail> getJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MJualDetail getJualDetail(int jualDetailId);
	
	public int store(MJualDetail jualDetailModel);
	public int update(MJualDetail jualDetailModel);
	public int delete(MJualDetail jualDetailModel);
}
