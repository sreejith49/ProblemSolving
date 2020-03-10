package com.javainterviewqn.org.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2Tests {

	
	@BeforeTest
	public void module2Prerequisites() {
		
		System.out.println("Ran module2Prerequisites method");
	}
	
	@Test
	public void module2Test1() {
		
		System.out.println("Ran module2Test1 method");
	}
	
	
}
