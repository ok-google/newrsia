package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPendaftaran;

public interface PendaftaranDAO {
	public List<MPendaftaran> getPendaftarans();
	public List<MPendaftaran> getPendaftarans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPendaftaran getPendaftaran(int PendaftaranId);
	
	public int PendaftaranStore(MPendaftaran PendaftaranModel);
	public void PendaftaranUpdate(MPendaftaran PendaftaranModel);
	public void PendaftaranDelete(MPendaftaran PendaftaranModel);
}
