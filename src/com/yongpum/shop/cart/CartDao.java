package com.yongpum.shop.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class CartDao {
	private DataSource dataSource;
	public CartDao() throws Exception {
		Properties properties = new Properties();
		properties.load(this.getClass().getResourceAsStream("/com/yongpum/shop/db.properties"));
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(properties.getProperty("driverClass"));
		basicDataSource.setUrl(properties.getProperty("url"));
		basicDataSource.setUsername(properties.getProperty("user"));
		basicDataSource.setPassword(properties.getProperty("password"));
		dataSource = basicDataSource;
	}
	
	public boolean isProductExist(String sUerId, int p_no) throws Exception {
		boolean isExist = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "select count(*) as p_count from cart c join userinfo u on c.userid = u.userid where u.userid = ? and c.p_no = ?";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(selectSql);
			pstmt.setString(1, sUerId);
			pstmt.setInt(2, p_no);
			rs = pstmt.executeQuery();
			int count = 0;
			if (rs.next()) {
				count = rs.getInt(1);
			}
			if (count == 0) {
				isExist = false;
			} else {
				isExist = true;

			}
		} finally {
			if (con != null) {
				con.close();
			}
		}
		
		return isExist;
	}

}
