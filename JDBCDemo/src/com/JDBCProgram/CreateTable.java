package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293?useSSL=false", "root", "root");

		PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS Student (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT)");

		int result = ps.executeUpdate();

		if (result == 0) {
			System.out.println("Table is Created...!!!");
		} else {
			System.out.println("Table already exists...!!!");
		}

	}

}