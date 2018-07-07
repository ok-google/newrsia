package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MReturJualDetail;

public interface ReturJualDetailDAO {
	public List<MReturJualDetail> getReturJualDetails();
	public List<MReturJualDetail> getReturJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturJualDetail getReturJualDetail(int ReturJualDetailId);
	
	public int ReturJualDetailStore(MReturJualDetail ReturJualDetailModel);
	public int ReturJualDetailUpdate(MReturJualDetail ReturJualDetailModel);
	public int ReturJualDetailDelete(MReturJualDetail ReturJualDetailModel);
}
