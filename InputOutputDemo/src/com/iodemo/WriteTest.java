package com.iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// IO classes are belong to io package.

public class WriteTest {

	public static void main(String[] args) throws IOException {
		
		/*ill will take input from java means i will hardcode the */

		File file = new File("input.txt");
		
		String str = "Copy this string to File";
		
		FileWriter writer = new FileWriter(file);
		
		writer.write(str);
		writer.close();
		
		
	}

}
