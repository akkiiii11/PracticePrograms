//package com.product.daoimplementation;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import javax.sql.ConnectionEvent;
//
//import com.product.dao.ProductDAO;
//
//public class ProductImplementation implements ProductDAO{
//
//	@Override
//	public void addProduct() throws ClassNotFoundException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
//		
//		
//	}
//
//	@Override
//	public void deleteProduct() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void editProduct() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void getProductById() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
