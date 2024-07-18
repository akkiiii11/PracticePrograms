package com.javademo;

abstract class Employee1
{
	abstract void salary();
}

class PermanantEmployee extends Employee1
{
	void salary()
	{
		System.out.println("Basic + Bonus + leave + HRA");
	}
}

class TempEmployee extends Employee1
{
	void salary()
	{
		System.out.println("Basic + HRA + leave");
	}
}

public class EmployeeMain {

	public static void main(String[] args) {

		

	}

}
