package com.javademo;

//abstract method connot be private by default is public either protected.
//abstract method cannot be static.
//constructor and fields cannot be declare .

abstract class Animal
{
	int i;
	
	public Animal()
	{
		
	}
	
	abstract void soundAnimal();  //abstract method     
	
	void display()  //concreate method
	{
		
	}
	
	void akanksha()
	{
		
	}
	
//	abstract void abc();
}

class Cat extends Animal
{

	@Override
	void soundAnimal() {

		System.out.println("Meow");
		
	}
	
}

class Cow extends Animal
{

	@Override
	void soundAnimal() {

		System.out.println("Hammm ");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
//		You cannot create object of a class
//		Animal a1 = new Animal();
		
		Cat c1 = new Cat();
		Animal a1 = c1;
		
//		Concreate class object is auto upcasted to the abstarct class

	}

}
