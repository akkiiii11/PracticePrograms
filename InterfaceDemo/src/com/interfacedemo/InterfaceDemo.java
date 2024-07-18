package com.interfacedemo;

// interfaces, another way of implementing abstraction in java.
// all the interfaces and methods in interfaces in a java are by default abstract.
// In a interface, all methods are purely abstract not any method is concrete.
// all the methods in interface are pure abstract method no concrete methods till java 1.8 version
// After the 1.8 version, You can add concrete method in interface but they must be dafault and static.
// cannot create abstract method is private.
// by default the fields in a interfaces are public static and final.
// you cannot create object of the interface in main method.
// cannot create a object of a instantiate the type InterfaceSample.
// multiple inheritance get acheive.

interface InterfaceSample
{
	
	int i = 0;
	
	void display();
	
	void show();
	
}

interface Sample
{
	void xyz();
}

class ABC implements InterfaceSample, Sample
{

	@Override
	public void display() {
		
//		System.out.println(i++);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
//		InterfaceSample i = new InterfaceSample();
		
	}

}
