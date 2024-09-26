package com.baseUtility;

import org.testng.annotations.*;

public class Base {

	@BeforeSuite
	public void configBS()
	{
		System.out.println("bs");
	}
	@BeforeClass
	public void configBC()
	{
		System.out.println("bc");
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("bm");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("am");
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("ac");
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("as");
	}
}
