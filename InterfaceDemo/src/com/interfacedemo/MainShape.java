package com.interfacedemo;

public class MainShape {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(10, 13);
		Circle cir = new Circle(3);
		Triangle tri = new Triangle(5, 4);
		
		System.out.println("Area of a Rectangle is " +rect.getArea());
		System.out.println("Area of a Circle is " +cir.getArea());
		System.out.println("Area of a Triangle is " +tri.getArea());
	}

}
