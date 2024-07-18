package com.thread;

public class MainThreadDemo {

	public static void main(String[] args) {

//		Thread t = Thread.currentThread();
//		t.setName("I am main Thread");
//		System.out.println(t.getName());
//		Thread.currentThread().setName("I am main Thread");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.MIN_PRIORITY/*(Constant Value)*/);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.currentThread().getPriority());

	}

}