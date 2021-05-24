package com.yongpum.shop.cart;

import java.util.ArrayList;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		cartDao = new CartDao();
	}
	
	public int addCart(String sUserid, int p_no, int cart_qty) throws Exception {
		if (cartDao.isProductExist(sUserid, p_no)) {
			return cartDao.update(sUserid, p_no, cart_qty);
		} else {
			return cartDao.add(sUserid, p_no, cart_qty);
		}
	}
	
	public ArrayList<Cart> getCartList(String sUserId) throws Exception {
		return cartDao.getCartList(sUserId);
	}
	
	public int deleteCart(String sUserId) throws Exception {
		return cartDao.deleteCart(sUserId);
	}

}
