package com.string
;
/*
 * String Comparison
 * String Comparison can be done in 3 ways:
 * */
public class StringDemo
{
	public static void main(String[] args) 
	{
		// concat two strings
		String name1 = "Akanksha";
		String name2 = "Salunkhe";
		String name3 = name1.concat(name2);
		System.out.println(name3);
		
		// OR
		String name4 = "Akanksha";
		String name5 = "Salunkhe";
		String name6 = name4+name5;
		System.out.println(name6);
		
		/* Using equals() methods
		 * equal() method compares two strngs for equality
		 * it compare the content of the strings
		 * it will return true if string matches else return false.*/
		// by using Literal way 
		String s = "Hell";   // StringPool Area
		String s1 = "Hello";
		String s2 = "Hello";
		// by using new keyword
		String s3 = new String("Hello");
		String s4 = new String("JAva");
		System.out.println(s.equals(s1)); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3));
		
		
		// using == operator
		String ss1 ="Java";
		String ss2 ="Java";
		String ss3 = new String("Java");
		String ss4 = new String("Java");
		System.out.println(ss1==ss2);// true
		System.out.println(ss1==ss3);// false
		System.out.println(ss3==ss4);// false
		
		// By using compareTo() method
		//String Class Method
		//chaerAt()
		String name="Akanksha";
		System.out.println(name.charAt(2));//v
		
		//equalsIgnoreCase()
		String n1= "Akanksha";
		System.out.println(n1.equalsIgnoreCase("nivedita"));//true
		
		// length()
		String n2 = "Padmaja Patil";
		System.out.println(n2.length());
		
		//replace()
		String n3= "Padmaja patil";
		System.out.println(n3.replace('p', 'P'));
		
		//substring()
		String n4= "123456789";
		System.out.println(n4.substring(3));
		System.out.println(n4.substring(3, 7));
		
		//toLower Case
		String n5= "AKANKSHA";
		System.out.println(n5.toLowerCase());
		
		//toUpper Case
		String n6= "Akanksha";
		System.out.println(n6.toUpperCase());
		
	}

}
