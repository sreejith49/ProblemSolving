package com.javainterviewqn.org.testngmoduletests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module3Tests {
	
	@BeforeTest
	public void module3Prerequisites() {
		
		System.out.println("Ran module3Prerequisites method");
	}
	
	@Test
	public void module3Test1() {
		
		System.out.println("Ran module3Test1 method");
	}
	
	@Test
	public void module1Test2() {
		
		System.out.println("Ran module3Test2 method");
	}

}
