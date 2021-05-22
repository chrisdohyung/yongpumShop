package com.yongpum.shop.user;

public class UserService {
	private UserDao userDao;
	public UserService() throws Exception {
		userDao = new UserDao();
	}
	
	public int create(User user) throws Exception {
		if (userDao.existedUser(user.getUserId())) {
			throw new ExistedUserException(user.getUserId()+" your id is not existed.");
		}
		return userDao.create(user);
	}

}
