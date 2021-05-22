package com.yongpum.shop.product;

import java.util.ArrayList;

public class ProductService {
	private ProductDao productDao;
	
	public ProductService() throws Exception {
		productDao = new ProductDao();
	}
	
	public ArrayList<Product> getProductList() throws Exception {
		ArrayList<Product> productList = productDao.getProductList();
		return productList;
	}
	
	public Product getProduct(int p_no) throws Exception {
		Product product = productDao.getProduct(p_no);
		return product;
	}
	
	public boolean updateReadcount(int p_no) throws Exception {
		boolean result = false;
		result = productDao.updatedReadcount(p_no);
		return result;
	}

}
