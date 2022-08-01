package com.testing.code;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence_TestNG_Annotations_Execution {
	@BeforeSuite
  public void beforeSuiteTest() {
	System.out.println("This is BeforeSuite Annotation");
}
	@BeforeTest
	public void beforeTestTest() {
		System.out.println("This is BeforeTest Annotation");
	}
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("This is BeforeTest Annotation");
	}
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is BeforeMethod Annotation");
		
	}
	@Test
	public void checkTest() {
		System.out.println("This is my test case");
		
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("This is AfterMethod Annotation");	
	}
	
	@AfterClass
	public void afterClassTest() {
		System.out.println("This is AfterClass Annotation");
	}
	
	@AfterTest
	public void afterTestTest() {
		System.out.println("This is AfterTest Annotation");
	}
	
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("This is AfterSuite Annotation");
}
}