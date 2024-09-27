package com.demo;

import java.util.*;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseUtility.Base;

public class Testing 
{

	@Test(retryAnalyzer = com.demo.IRetry.class)
	public void main()
	{
	    Assert.assertEquals("A", "B");
	    
	 
		//f.m1();
		
	}
	
}
