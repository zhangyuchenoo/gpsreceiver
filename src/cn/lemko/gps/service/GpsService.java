package cn.lemko.gps.service;

import javax.annotation.Resource;

import cn.lemko.gps.domain.GpsData;
import cn.lemko.gps.server.dao.GpsDataLoader;

public class GpsService {
	@Resource
	private GpsDataLoader dao;

	public GpsDataLoader getDao() {
		return dao;
	}

	public void setDao(GpsDataLoader dao) {
		this.dao = dao;
	}

	public void save() {
		GpsData gps = new GpsData();
		gps.setLat("44.11");
		gps.setLng("111.11");
		dao.save(gps);
	}
}
