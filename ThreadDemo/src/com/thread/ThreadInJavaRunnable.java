package com.thread;

class ThreadFirst implements Runnable
{
	@Override
	public void run() {
		
		for(int i=0; i<=5; i++)
		{
			System.out.println("Thread 1 = " + i);
		}
		
	}
	
}
class ThreadSecond implements Runnable
{

	@Override
	public void run() {
		for(int i=0; i<=5; i++)
		{
			System.out.println("Thread 2 = " + i);
		}
		
	}
	
}
public class ThreadInJavaRunnable {

	public static void main(String[] args) {
		ThreadFirst t1=new ThreadFirst();
		Thread t=new Thread(t1);
		t.start();
		
		ThreadSecond t2=new ThreadSecond();
		Thread tt1=new Thread(t2);
		tt1.start();
		
		System.out.println("my name is main thread");
	}

}
