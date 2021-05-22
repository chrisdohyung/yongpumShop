package com.yongpum.shop.user;

import java.util.ArrayList;

import com.yongpum.shop.user.exception.*;

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
			throw new UserNotFoundException(userId +" your id is not existed");
		}
		if (!user.isMatchPassword(password)) {
			throw new PasswordMismatchException("your password is not matched.");
		}
		return user;
	}
	
	public ArrayList<User> findUserList() throws Exception {
		return userDao.findUserList();
	}
	
	public User findUser(String userId) throws Exception {
		User findUser = userDao.findUser(userId);
		return findUser;
	}
	
	public int update(User user) throws Exception {
		return userDao.update(user);
	}
	
	public int remove(String userId) throws Exception {
		return userDao.remove(userId);
	}

}
