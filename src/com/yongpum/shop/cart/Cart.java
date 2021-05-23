package com.yongpum.shop.cart;

import com.yongpum.shop.product.Product;
import com.yongpum.shop.user.User;

public class Cart {
	private int cart_no;
	private User user;
	private Product product;
	private int cart_gty;
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public Cart(int cart_no, User user, Product product, int cart_gty) {
		super();
		this.cart_no = cart_no;
		this.user = user;
		this.product = product;
		this.cart_gty = cart_gty;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCart_gty() {
		return cart_gty;
	}
	public void setCart_gty(int cart_gty) {
		this.cart_gty = cart_gty;
	}
	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", user=" + user + ", product=" + product + ", cart_gty=" + cart_gty + "]";
	}
	

}
