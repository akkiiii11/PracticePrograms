package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
//		
//		PreparedStatement ps = con.prepareStatement("delete from emp where empid = 1");
//		
//		ps.execute();
//		
//		System.out.println("Employee Record Deleted Successfully...!!!");
//		con.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("delete from emp where empid = ?");	//to update a data
		
		int id;
		
		Scanner sc = new Scanner(System.in);	//give a input from user
		
		System.out.println("Please fill the Employee Details...");
		
		System.out.println("Enter the Employee ID: ");
		id = sc.nextInt();
		
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Data is Deleted Successfully...");
		
	}

}
