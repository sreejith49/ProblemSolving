package com.javainterviewqn.org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Main {
	
	@BeforeMethod
	public void runOnBeforeAllMethods() {
		
		System.out.println("Ran runOnBeforeAllMethods method");
	}
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("Ran runBeforeClass method");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("Ran runAtferClass method");
	}

}
