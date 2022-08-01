package com.testing.code;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Catch_Implementing_TestNG_Annotations {
	// Should I use all the TestNG annotations - No it totally depends on you.
		// Is there something which is exceptional - Yes there is

		@BeforeTest
		public void launchBrowser() {
			System.out.println("Launch Browser Logic");
		}

		@Test
		public void iAMMUST() {
			System.out.println("I have to be there to execute other annotations");
		}

		@AfterTest
		public void tierDown() {
			System.out.println("My code is over");
		}
}
