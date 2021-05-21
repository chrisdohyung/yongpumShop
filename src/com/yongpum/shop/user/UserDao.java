package com.yongpum.shop.user;

import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class UserDao {
	
	private DataSource dataSource;
	
	public UserDao() throws Exception {
		Properties properties = new Properties();
		properties.load(this.getClass().getResourceAsStream("/com/yongpum/shop/db.properties"));
		BasicDataSource basicDatasource = new BasicDataSource();
		basicDatasource.setDriverClassName(properties.getProperty("driverClass"));
		basicDatasource.setUrl(properties.getProperty("url"));
		basicDatasource.setUserName(properties.getProperty("user"));
		basicDatasource.setPassword(properties.getProperty("password"));
		dataSource = basicDataSource;
	}

}
