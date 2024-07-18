package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//String is immutable class
		//StringBuffer and String are mutable
		
		StringBuffer sb = new StringBuffer("Java");	//using new keyword
		sb.replace(0, 0, null);
		sb.substring(0);
		
//		StringBuffer objects are thread safety.
		StringBuilder sb1 = new StringBuilder();

	}

}
