package com.javademo;

class Employee
{
	//How to acheive data Encapsulation: declaring a variables of a class as private.
	private int id;
	private String name;
	private String desig;
	private String sal;
	private String dob;
	private String username;
	private String passwordtt;
	
	public Employee()
	{
		super();
		
	}

	public Employee(int id, String name, String desig, String sal, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
		this.dob = dob;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordtt() {
		return passwordtt;
	}

	public void setPasswordtt(String passwordtt) {
		this.passwordtt = passwordtt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + ", sal=" + sal + ", dob=" + dob
				+ ", username=" + username + ", passwordtt=" + passwordtt + "]";
	}
	
	
}

public class EmpMain {

	public static void main(String[] args) {
		
		

	}

}
