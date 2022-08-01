package com.testing.code;

import org.testng.annotations.Test;

public class Enablement_Disablement_TestCase {
	@Test
	public void testCase1() {
		System.out.println("Logic part 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Logic part 2");
	}

	@Test
	public void testCase3() {
		System.out.println("Logic part 3");
	}
	

	@Test(enabled = false)
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

