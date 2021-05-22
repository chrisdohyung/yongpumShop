package com.yongpum.shop.user;

import com.yongpum.shop.user.exception.ExistedUserException;

public class UserService {
	private UserDao userDao;
	public UserService() throws Exception {
		userDao = new UserDao();
	}
	
	public int create(User user) throws Exception {
		if (userDao.existedUser(user.getUserId())) {
			throw new ExistedUserException(user.getUserId()+" your id is already existed.");
		}
		return userDao.create(user);
	}
	
	public User login(String userId, String password) throws Exception {
		User user = userDao.findUser(userId);
		if (user == null) {
			throw new UserNotFoundException()userId +" your id is not existed";
		}
		return user;
	}

}
