package com.iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("input.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String str;

		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close();
//		f1.close();
	}

	
}
