package com.yongpum.shop.test;

import com.yongpum.shop.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();
		System.out.println(productDao.getProductList());

	}

}
