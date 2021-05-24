package com.yongpum.shop.test;

import java.sql.Date;
import java.util.ArrayList;

import com.yongpum.shop.cart.Cart;
import com.yongpum.shop.jumun.Jumun;
import com.yongpum.shop.jumun.JumunDao;
import com.yongpum.shop.jumun.JumunDetail;
import com.yongpum.shop.product.Product;
import com.yongpum.shop.product.ProductDao;
import com.yongpum.shop.user.User;

public class JumunDaoTestMain {

	public static void main(String[] args) throws Exception {
		JumunDao jumunDao = new JumunDao();
		System.out.println(jumunDao.list("test1"));
		System.out.println(jumunDao.detail("test1",1));
		
		ArrayList<Cart> cartList = new ArrayList<>();
		
		int p_qty =1;
		int p_no = 1;
		ProductDao productDao = new ProductDao();
		Product product = productDao.getProduct(p_no);
		Cart cart = new Cart(0, new User(), product, p_qty);
		
		ArrayList<JumunDetail> jumunDetailList = new ArrayList<>();
		
		Jumun newJumun = new Jumun(0, "Beagle and 3 more", new Date(3213),450000, "test1", jumunDetailList);
		jumunDao.create(newJumun);

	}

}
