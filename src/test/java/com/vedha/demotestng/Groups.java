package com.vedha.demotestng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {
	@BeforeGroups("Student")
	public void beforeit()
	{
		System.out.println("this method will execute before the student");
	}
	@Test(groups = "student")
	public void test1()

	{
		System.out.println("ashwini");
	}
	@Test
	public void test3()

	{
		System.out.println("aadhvitha");
	}

	@Test(groups = "student")
	public void test2()

	{
		System.out.println("ajay");
	}
}
