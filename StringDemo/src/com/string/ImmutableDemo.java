package com.string;

public class ImmutableDemo {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		System.out.println(s1 == s2); 
		
		
		System.out.println(s1.concat("J2SE"));
		System.out.println(s1);
		
		//s1 =s1 + "J2EE";
		//s1.concat("XYZ");
		
		//System.out.println(s1);
		//System.out.println(s1 == s2);
		

		
		  String s11 = new String("JAVA");
		  
		  System.out.println(s11); //Output : JAVA
		  
		  s11.concat("J2EE");
		  
		  System.out.println(s11); //Output : JAVA
		 	}

}

