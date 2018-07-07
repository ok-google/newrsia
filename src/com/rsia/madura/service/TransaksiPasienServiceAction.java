package com.rsia.madura.service;

import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TransaksiPasienDAO;
import com.rsia.madura.entity.MTransaksiPasien;
import com.rsia.madura.entity.MTransaksiBayar;

@Service
public class TransaksiPasienServiceAction implements TransaksiPasienService {
	@Autowired
	private TransaksiPasienDAO transaksiPasienDAO;

	@Override
	@Transactional
	public List<MTransaksiPasien> findAll() {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.getTransaksiPasiens();
	}

	@Override
	@Transactional
	public List<MTransaksiPasien> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.getTransaksiPasiens(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MTransaksiPasien getTransaksiPasien(int id) {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.getTransaksiPasien(id);
	}

	@Override
	@Transactional
	public MTransaksiPasien findBy(String key, String value) {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.findBy(key, value);
	}

	@Override
	@Transactional
	public List<MTransaksiPasien> findsBy(String key, String value) {
		// TODO Auto-generated method stub
		return transaksiPasienDAO.findsBy(key, value);
	}

	@Override
	@Transactional
	public int store(MTransaksiPasien data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setTransaksiAktif("Y");
		data.setTransaksiCreatedBy("Admin");	
		data.setTransaksiCreatedDate(currentTime);

		if (data.getBayar() != null) {
			data.getBayar().forEach((bayar) -> {
				if (bayar.getTransaksiBayarNominal() != null) {
					if (bayar.getTransaksiBayarNominal() > data.getHarusBayar()) {
						bayar.setTransaksiBayarNominal(data.getHarusBayar());	
					}

					bayar.setTransaksi(data);
					bayar.setTransaksiBayarCreatedBy("Admin");
					bayar.setTransaksiBayarCreatedDate(currentTime);
				}
			});
		}
		
		if (data.getItem() != null) {
			data.getItem().forEach((item) -> {
				item.setTransaksi(data);
				item.setTransaksiItemCreatedBy("Admin");
				item.setTransaksiItemCreatedDate(currentTime);
				item.setTransaksiItemUpdatedDate(currentTime);
			});
		}
		
		return transaksiPasienDAO.TransaksiPasienStore(data);
	}

	@Override
	@Transactional
	public void update(MTransaksiPasien data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		data.setTransaksiUpdatedBy("Admin");	
		data.setTransaksiUpdatedDate(currentTime);

		if (data.getBayar() != null) {
			data.getBayar().forEach((bayar) -> {
				if (bayar.getTransaksiBayarNominal() != null) {
					if (bayar.getTransaksiBayarNominal() > data.getHarusBayar()) {
						bayar.setTransaksiBayarNominal(data.getHarusBayar());	
					}
					
					bayar.setTransaksi(data);
					bayar.setTransaksiBayarUpdatedBy("Admin");
					bayar.setTransaksiBayarUpdatedDate(currentTime);
				}
			});
		}
		if (data.getItem() != null) {
			data.getItem().forEach((item) -> {
				item.setTransaksi(data);
				item.setTransaksiItemUpdatedBy("Admin");
				item.setTransaksiItemUpdatedDate(currentTime);
			});
		}
		transaksiPasienDAO.TransaksiPasienUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MTransaksiPasien data) {
		// TODO Auto-generated method stub
		transaksiPasienDAO.TransaksiPasienDelete(data);
	}
}
