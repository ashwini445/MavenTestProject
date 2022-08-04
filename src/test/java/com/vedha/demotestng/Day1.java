package com.vedha.demotestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	@Test(priority = 2)
	public void day1()

	{
		System.out.println("inside first test annotation");
	}
		@Test(priority = 1)
		public void day2()
		{
			System.out.println("second test");
		}
		@AfterSuite
		public void day3()
		{
			System.out.println("third test");
		}
}
