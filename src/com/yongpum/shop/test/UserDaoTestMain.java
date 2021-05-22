package com.yongpum.shop.test;

import com.yongpum.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		UserDao userDao = new UserDao();
		System.out.println(userDao.findUserList());
	}
}
