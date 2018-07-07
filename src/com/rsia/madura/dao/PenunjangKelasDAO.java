package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPenunjangKelas;

public interface PenunjangKelasDAO {
	public List<MPenunjangKelas> getPenunjangKelass();
	public List<MPenunjangKelas> getPenunjangKelass(int page, int limit);
	public String createLinks(int page, int limit);
	public MPenunjangKelas getPenunjangKelas(int PenunjangKelasId);

	public void PenunjangKelasStore(MPenunjangKelas penunjangModel);
	public void PenunjangKelasUpdate(MPenunjangKelas penunjangModel);
	public void PenunjangKelasDelete(MPenunjangKelas penunjangModel);
}