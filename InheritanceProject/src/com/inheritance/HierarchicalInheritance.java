package com.inheritance;

// 		class A
//		|	|
//		|	|
// class B	class c

class Animal2
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog2 extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();		

	}

}
