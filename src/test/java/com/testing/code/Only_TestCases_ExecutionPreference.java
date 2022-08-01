package com.testing.code;

import org.testng.annotations.Test;

public class Only_TestCases_ExecutionPreference {
	//test cases are executed alphabetically as per method names
    //if you are not using priority in all test cases, testng will follow alphabetical seq.

@Test(priority = 1)
public void BB() {
System.out.println("Logic part 1");
}

@Test(priority = 2)
public void AA() {
System.out.println("Logic part 2");
}

@Test (priority = 3)
public void CC() {
System.out.println("Logic part 3");

}
}
