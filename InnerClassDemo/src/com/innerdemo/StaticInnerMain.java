package com.innerdemo;

class OuterClass1
{
	int x = 10;
	
	static class InnerClass
	{
		int y = 5;
	}
}

public class StaticInnerMain {

	public static void main(String[] args) {
		
		OuterClass1.InnerClass myInner = new OuterClass1.InnerClass();
		System.out.println(myInner.y);

	}

}
