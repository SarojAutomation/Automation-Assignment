package com.testing.code;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_False_TestNG {
	// @BeforeMethod + @Test + @AfterMethod

		@BeforeMethod
		public void beforeMethodTest() {
			System.out.println("some beginning logic");
		}

		@Test
		public void testCase1() {
			System.out.println("Logic part 1");
		}

		@Test
		public void testCase2() {
			System.out.println("Logic part 2");
		}

		@Test(enabled = false)
		public void testCase3() {
			System.out.println("Logic part 3");
		}
		@Test
		public void testCase4() {
			System.out.println("Logic part 4");
		}
		@AfterMethod
		public void afterMethodTest() {
			System.out.println("Ending Logic");
		}

	}
	
