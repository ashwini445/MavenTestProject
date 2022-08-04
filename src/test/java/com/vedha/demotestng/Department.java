package com.vedha.demotestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Department {
	@BeforeClass
	public void company()
	{
		System.out.println("bpktech");
	}
	
	@Test
	public void hr()
	{
		System.out.println("hr");
	}
	@Test
	public void manager()
	{
		System.out.println("manager");
	}
	@Test
	public void testEngineer()
	{
		System.out.println("tester");
	}
	@Test
	public void developer()
	{
		System.out.println("developer");
	}
}
