package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTransaksiPasien;

public interface TransaksiPasienDAO {
	public List<MTransaksiPasien> getTransaksiPasiens();
	public List<MTransaksiPasien> getTransaksiPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MTransaksiPasien getTransaksiPasien(int TransaksiPasienId);
	public MTransaksiPasien findBy(String key, String value);
	public List<MTransaksiPasien> findsBy(String key, String value);
	
	public int TransaksiPasienStore(MTransaksiPasien TransaksiPasienModel);
	public void TransaksiPasienUpdate(MTransaksiPasien TransaksiPasienModel);
	public void TransaksiPasienDelete(MTransaksiPasien TransaksiPasienModel);
}
