package com.testing.code;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsON_Methods {
	@Test
	public void testCase1() {
		System.out.println("Logic part 1");
		Assert.fail("Failing it to check"); //if this is a recurring issue, or it has a historical background and you want to ignore the output of this
	}

	@Test(dependsOnMethods = "testCase1", alwaysRun = true)
	public void testCase2() {
		System.out.println("Logic part 2");
	}

	@Test(dependsOnMethods = {"testCase1", "testCase2"})
	public void testCase3() {
		System.out.println("Logic part 3");
	}
	

	@Test
	public void testCase4() {
		System.out.println("Logic part 4");
	}

	@Test
	public void testCase5() {
		System.out.println("Logic part 5");
	}

	@Test
	public void testCase6() {
		System.out.println("Logic part 6");
	}

}

