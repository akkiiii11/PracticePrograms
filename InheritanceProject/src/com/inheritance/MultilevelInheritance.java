package com.inheritance;

// class c --> class B --> class A

class Animal1
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog1 extends Animal
{
	void bark()	
	{
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();

	}

}
