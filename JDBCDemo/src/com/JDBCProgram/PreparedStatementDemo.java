package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");	//to insert a data
		
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
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, desig);
		ps.setString(4, dept);
		ps.setInt(5, sal);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		
		
		System.out.println(i + "Data is Added Successfully...");
		
		System.out.println("Employee Details: ");
		System.out.println("==================");
		
		while(i >0)
		{
			System.out.println(id+ " " +name+ " " +desig+ " " +dept+ " " +sal);
			break;
			
		}
		
		con.close();
		
		
	}

}
