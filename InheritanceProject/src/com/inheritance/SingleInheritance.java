package com.inheritance;

// Syntax
// classSubclassname extends Superclassname
// {
//		//Methods and fields
// }

// class B ---> class A 

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}
