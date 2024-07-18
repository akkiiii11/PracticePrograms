package com.methodoverriding;

//child class
public class Dog extends Animal {
	
	@Override
	public void makeSound()
	{
		System.out.println("Dog is barking");
	}

}
