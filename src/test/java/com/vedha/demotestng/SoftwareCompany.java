package com.vedha.demotestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SoftwareCompany {
	@BeforeClass
	public void bpktech()
	{
		System.out.println("bpktech");
	}
	@Test(groups = "software company")
	public void revueSoft()

	{
		System.out.println(" revuesoft company");
	}
	@Test
	public void capGemini()

	{
		System.out.println("Capgemini");
	}
	
	public void tech()

	{
		System.out.println("techmahindra");
	}


	@Test(groups = "software company")
	public void wipro()

	{
		System.out.println("wipro");
	}
}
