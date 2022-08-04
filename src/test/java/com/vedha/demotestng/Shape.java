package com.vedha.demotestng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Shape {
	@BeforeSuite
	public void circle()

	{
		System.out.println("  circle");
	}
	
	@Test(enabled=false)
	public void rectangle()

	{
		System.out.println("rectangle  ");
	}
		
}
