package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEmployee {

	public void create() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293?useSSL=false", "root", "root");

		PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT, gender VARCHAR(50), dept VARCHAR(50))");

		int result = ps.executeUpdate();

		if (result == 0) 
		{
			System.out.println("Employee Table is Created...!!!");
		} 
		else 
		{
			System.out.println("Employee Table already exists...!!!");
		}
	}
	
	public void update() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("Update Employee set name=?, age=?, gender=?, dept=? where id = ?");	//to update a data
		
		int id;
		String name, age, gender, dept;
		
		Scanner sc = new Scanner(System.in);	//give a input from user
		
		System.out.println("Update Employee Details...");
		
		System.out.println("Enter the Employee ID: ");
		id = sc.nextInt();
		
		System.out.println("Enter the Employee Name: ");
		name = sc.next();
		
		System.out.println("Enter the Employee Age: ");
		age = sc.next();
		
		System.out.println("Enter the Employee Gender: ");
		gender = sc.next();
		
		System.out.println("Enter the Employee Dept Name: ");
		dept = sc.next();
		
		ps.setInt(5, id);
		ps.setString(1, name);
		ps.setString(2, age);
		ps.setString(3, gender);
		ps.setString(4, dept);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Employee Data is Updated Successfully...");
	}
	
	public void delete() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("delete from Employee where id = ?");	//to update a data
		
		int id;
		
		Scanner sc = new Scanner(System.in);	//give a input from user
		
		System.out.println("Delete Employee Details...");
		
		System.out.println("Enter the Employee ID: ");
		id = sc.nextInt();
		
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Employee Data is Deleted Successfully...");
	}
	
	public void insert() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?,?)");	//to insert a data
		
		int id;
		String name, age, gender, dept;
		
		Scanner sc = new Scanner(System.in);	//give a input from user
		
		System.out.println("Insert the Employee Details...");
		
		System.out.println("Enter the Employee ID: ");
		id = sc.nextInt();
		
		System.out.println("Enter the Employee Name: ");
		name = sc.next();
		
		System.out.println("Enter the Employee Age: ");
		age = sc.next();
		
		System.out.println("Enter the Employee Gender: ");
		gender = sc.next();
		
		System.out.println("Enter the Employee dept Name: ");
		dept = sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, age);
		ps.setString(4, gender);
		ps.setString(5, dept);
		
		int i = ps.executeUpdate();		//executeUpdate return a int.
		
		
		System.out.println(i + "Employee Data is Added Successfully...");
		con.close();
	}
	
	public void exit()
	{
		System.out.println("Please Enter Valid Input...!!!");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		JDBCEmployee jdbc = new JDBCEmployee();
		
		while(true)
		{
			System.out.println("Choose any Option: 1.Create  2.Update  3.Delete  4.Insert 5.Exit");
			int ch = sc.nextInt();
		
		
		switch(ch)
		{
			case 1: 
				jdbc.create();
				break;
				
			case 2:
				jdbc.update();
				break;
				
			case 3:
				jdbc.delete();
				break;
				
			case 4:
				jdbc.insert();
				break;
				
			case 5:
				jdbc.exit();
				break;
			
		}
		sc.close();
		}

	}

	
	
}	


