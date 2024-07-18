package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class MyFirstJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		com.mysql.cj.jdbc.Driver     driver name     //Driver-class
//		jdbc:mysql://localhost:3308/mydb		//mysql url
		
//		API :Database	//machine:3308
//		localmachine port no is always 3308
		
		
		
//		Register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");	//Class=class name
		
//		step establish connection to mysql
//		JDBC api which are the interfaces and classes are avilable
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293","root","root");
		
		Statement stmt = con.createStatement();
		
//		stmt.executeUpdate("insert into emp values(1, 'Akanksha', 'Student', 'MCA', 3000)");
//		stmt.executeUpdate("insert into emp values(2, 'Nivedita', 'Manager', 'IT', 30000)");
		stmt.executeUpdate("insert into emp values(3, 'Sunny', 'Junior Manager', 'Non-IT', 5000)");
		System.out.println("Employee added Successfully...!!!");
		con.close();
	}

}
