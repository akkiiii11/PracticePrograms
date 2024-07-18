package com.thread;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Akanksha - This is my Task!!!");
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("This is my Task!!!");
	}
}

public class ThreadNameDemo {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		mt.setName("Akanksha");
		String name = mt.getName();
		System.out.println(mt.getId());
		System.out.println(mt.getPriority());
		System.out.println(name);
		
		// Min priority - 1
		// Max Prioity - 10 
		// Norm Priority - 5
		
		MyThread2 mt2 = new MyThread2();
		mt2.setName("Nivedita");
		System.out.println(mt2.getName());
		System.out.println(mt2.getId());
		mt2.start();		

	}

}
