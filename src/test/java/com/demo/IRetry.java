package com.demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry implements IRetryAnalyzer{

	int count= 1 ;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<4)
		{
			count++;
			return true;
		}
		return false;
	}

}
