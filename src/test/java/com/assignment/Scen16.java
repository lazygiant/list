package com.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scen16 {

	@Test
	public void execute()
	{
		List<Integer> list = Arrays.asList(12, 12, 11, 56, 190, 7, 9);
		
	//	List<Integer> list1=list.stream().filter(x->x%3==0).sorted().distinct().collect(Collectors.toList());
		
		System.out.println(list);
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bikash");
		String value = driver.findElement(By.name("q")).getText();
		System.out.println(value);
	}
} 
