package com.practice.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTests {
	@BeforeClass
	@BeforeGroups(groups="Reg")
	public void reg() {
		
	}
	@Test(groups = "Reg")

	public void test() {
		System.out.println("Test Reg");
	}

	@Test(groups = "Reg")
	public void test2() {
		System.out.println("Test Reg"); // Regression test
	}

	@Test(groups = "wip")
	public void test3() {
		System.out.println("Test wip"); // work in progress
	}

	@Test(groups = "smoke")
	public void test4() {
		System.out.println("smoke test");
	}
}
