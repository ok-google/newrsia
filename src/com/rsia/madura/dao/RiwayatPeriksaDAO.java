/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 06:58:32
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 07:11:42
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MRiwayatPeriksa;

public interface RiwayatPeriksaDAO {
	public List<MRiwayatPeriksa> getRiwayatPeriksas();
	public List<MRiwayatPeriksa> getRiwayatPeriksas(int page, int limit);
	public String createLinks(int page, int limit);
	public MRiwayatPeriksa getRiwayatPeriksa(int RiwayatPeriksaId);
	
	public int RiwayatPeriksaStore(MRiwayatPeriksa RiwayatPeriksaModel);
	public void RiwayatPeriksaUpdate(MRiwayatPeriksa RiwayatPeriksaModel);
	public void RiwayatPeriksaDelete(MRiwayatPeriksa RiwayatPeriksaModel);
}
