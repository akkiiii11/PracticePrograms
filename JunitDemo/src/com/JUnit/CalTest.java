package com.JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTest {

	Calculator cal;
	@Before
	public void setUp() throws Exception 
	{
		cal  = new Calculator();
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void test() 
	{
		assertEquals(7,cal.add(4, 3) );
		assertEquals(4,cal.add(4, 0) );
		assertEquals(3,cal.add(0, 3) );
		//assertEquals(7,cal.add(5, 3) );
		
	}
	
	@Test
	public void test1() 
	{
		assertEquals(7,cal.add(5, 3) );
		
	}
	
	@Test
	public void test2()
	{
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2};
        int[] arr3 = {0, 0, 0, 0, 0};
        assertEquals(5, cal.findMax(arr1));
        assertEquals(2, cal.findMax(arr2));
        assertEquals(0, cal.findMax(arr3));
	}

}