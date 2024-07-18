package com.thread;

class ThreadOne extends Thread 
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thraed One =" + i);
			
		}
	}
}
class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thraed Two =" + i);
			
		}
	}
}
public class ThreadInJava {

	public static void main(String[] args) {
	
		ThreadOne t1=new ThreadOne(); // new state
		ThreadTwo t2=new ThreadTwo();
		t1.start();   // runnable 
		t1.start();
		t2.start();
		System.out.println("mai main method hu");
		//t1.join();
	}

}


