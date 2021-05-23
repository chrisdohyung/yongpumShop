package com.yongpum.shop.test;

import java.util.ArrayList;

import com.yongpum.shop.cart.Cart;
import com.yongpum.shop.jumun.JumunDao;

public class JumunDaoTestMain {

	public static void main(String[] args) throws Exception {
		JumunDao jumunDao = new JumunDao();
		System.out.println(jumunDao.list("test"));
		System.out.println(jumunDao.detail("test",1));
		
		ArrayList<Cart> cartList = new ArrayList<>();

	}

}
