package com.vedha.demotestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMeth {
int a=5;
int b=5;

@BeforeMethod
public void beforemethod() {
	System.out.println("before test method");
}
@Test
	public void sum() {
		int c=a+b;
		System.out.println("sum: "+c);
	}
@Test
	public void diff()
	{
		int d=a-b;
				System.out.println("diff: "+d);
	}
@AfterMethod
public void AfterMethod() {
	System.out.println("After test method");
}
}
