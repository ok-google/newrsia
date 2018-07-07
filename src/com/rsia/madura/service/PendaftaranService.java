package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPendaftaran;

public interface PendaftaranService {
	public List<MPendaftaran> getPendaftarans();
	public List<MPendaftaran> getPendaftarans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPendaftaran getPendaftaran(int id);
	
	public void store(MPendaftaran data);
	public void update(MPendaftaran data);
	public void delete(MPendaftaran data);
}
