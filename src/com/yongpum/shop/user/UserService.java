package com.yongpum.shop.user;

public class UserService {
	private UserDao userDao;
	public UserService() throws Exception {
		userDao = new UserDao();
	}

}
