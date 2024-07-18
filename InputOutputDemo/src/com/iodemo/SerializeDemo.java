package com.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("Person_Details.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person ps = new Person(11, "Akanksha");
		oos.writeObject(ps);
		
		fos.close();
		oos.close();
		
		System.out.println("File Created.");
		System.out.println("=============");
		System.out.println("Reading Ohject from file ie. De-Serialization");
		
		FileInputStream fis = new FileInputStream("Person_Details.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person ps1 = (Person) ois.readObject();
		
		System.out.println(ps1.getPid());
		
		System.out.println(ps1.getPname());
		
		ois.close();
		fis.close();
		
	}
}
