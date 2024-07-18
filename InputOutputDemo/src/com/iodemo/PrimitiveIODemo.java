package com.iodemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIODemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("Primitive.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(20);
		dos.writeDouble(2.4);
		dos.close();
		fos.close();
		
		System.out.println("File create Hua");
		System.out.println("===============");
		System.out.println("File Reading...");
		
		FileInputStream fis = new FileInputStream("Primitive.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
	}

}