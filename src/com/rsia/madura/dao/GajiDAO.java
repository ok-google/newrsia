package com.rsia.madura.dao;

import java.util.List;

// sesuaikan nama entitinya
import com.rsia.madura.entity.MGaji;

// sesuaikan nama file
public interface GajiDAO {
	public List<MGaji> getGajis();
	public List<MGaji> getGajis(int page, int limit);
	public MGaji getGaji(int gajiId);
	public String createLinks(int page, int limit);
	public void getTotal(MGaji gajiModel);
	
	public void gajiStore(MGaji gajiModel);
	public void gajiUpdate(MGaji gajiModel);
	public void gajiDelete(MGaji gajiModel);
}
