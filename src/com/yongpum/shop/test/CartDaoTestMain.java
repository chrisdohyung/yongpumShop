package com.yongpum.shop.test;

import com.yongpum.shop.cart.CartDao;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception {
		CartDao cartDao = new CartDao();
		System.out.println(cartDao.getCartList("test1"));

	}

}
