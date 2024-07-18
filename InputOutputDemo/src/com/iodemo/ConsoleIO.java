package com.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a String: ");
		
//		Scanner sc = new Scanner(System.in);		
		InputStreamReader ir = new InputStreamReader(null);
		BufferedReader in = new BufferedReader(ir);
		
		String line;
		while((line = in.readLine()) != null && (line.length()!=0))
		{
			System.out.println("You Entered: " +line);
		}
	}

}