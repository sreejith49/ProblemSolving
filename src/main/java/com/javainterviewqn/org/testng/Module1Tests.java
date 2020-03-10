package com.javainterviewqn.org.testng;

import org.testng.annotations.*;

public class Module1Tests extends Main{
	
	@BeforeTest
	public void module1Prerequisites() {
		
		System.out.println("Ran module1Prerequisites method");
	}
	
	@Test
	public void module1Test1() {
		
		System.out.println("Ran module1Test1 method");
	}
	
	@Test
	public void module1Test2() {
		
		System.out.println("Ran module1Test2 method");
	}

}
