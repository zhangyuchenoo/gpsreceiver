package cn.lemko.gps.server.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import cn.lemko.gps.domain.GpsData;
import cn.lemko.gps.server.dao.GpsDataLoader;

@Repository
public class GpsDataLoaderImpl extends JdbcDaoSupport implements GpsDataLoader {

	@Override
	public void save(GpsData gps) {
		String sql = "insert into gps_data values (null,'" + gps.getLng()
				+ "','" + gps.getLat() + "')";
		getJdbcTemplate().execute(sql);
	}
}
