package cn.lemko.gps.server.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.lemko.gps.server.dao.GpsDataLoader;

public class GpsDataLoaderImpl implements GpsDataLoader {
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}
