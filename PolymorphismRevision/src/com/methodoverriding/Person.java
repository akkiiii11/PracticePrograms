package com.methodoverriding;

//Main
public class Person {

	public static void main(String[] args) {
		
		RBI rate1 = new SBI();
		double intrate = rate1.interestRate();
		System.out.println(intrate);
		
		RBI rate2 = new ICICI();
		double intrate2 = rate2.interestRate();
		System.out.println(intrate2);
		
		RBI rate3 = new Axis();
		double intrate3 = rate3.interestRate();
		System.out.println(intrate3);
	

	}

}
