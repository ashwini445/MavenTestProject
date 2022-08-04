package com.vedha.demotestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Car {
	@AfterClass
	public void show() {
		System.out.println("showroom");
	}
	@Test(description = "car description")
	public void WebLoginHomeLoan()
	{
		System.out.println("webloginHome");
	}
	@Test(priority = 1)
	public void MobileLoginHomeLoan()  
	{
		System.out.println("mobileloginHome");
	}
	@Test(dependsOnMethods = "MobileLoginHomeLoan")
	public void LoginApiHomeLoan() 
	{
		System.out.println("apiloginHomeloan ");
	}
	
}
