package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("Update emp set empname=?, desig=?, department=?, salary=? where empid = ?");	//to update a data
		
		int id;
		String name, desig, dept;
		int sal;
		
		Scanner sc = new Scanner(System.in);	//give a input from user
		
		System.out.println("Please fill the Employee Details...");
		
		System.out.println("Enter the ID: ");
		id = sc.nextInt();
		
		System.out.println("Enter the Name: ");
		name = sc.next();
		
		System.out.println("Enter the Designation: ");
		desig = sc.next();
		
		System.out.println("Enter the Department: ");
		dept = sc.next();
		
		System.out.println("Enter the Salary: ");
		sal = sc.nextInt();
		
		ps.setInt(5, id);
		ps.setString(1, name);
		ps.setString(2, desig);
		ps.setString(3, dept);
		ps.setInt(4, sal);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Data is Updated Successfully...");

	}

}
