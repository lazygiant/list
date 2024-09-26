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

	@Test
	public void main()
	{
	    List<Integer> list=Arrays.asList(23, 12, 1, 2, 4, 5, 12);
	    
	    List<Object> sortedList = list.stream().sorted().distinct().collect(Collectors.toList());
	    
	    System.out.println(sortedList);
	    
	 
		//f.m1();
		
	}
	
}
