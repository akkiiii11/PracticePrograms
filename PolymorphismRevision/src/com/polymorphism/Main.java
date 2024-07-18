package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Akanksha ak1 = new Akanksha();
		Akanksha ak2 = new Session();	//upcasting
		Akanksha ak3 = new Home();
		
		ak1.form();
		ak2.form();
		ak3.form();
	}

}
