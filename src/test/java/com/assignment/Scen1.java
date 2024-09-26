package com.assignment;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scen1 {

	
	@Test
	public void execute() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Bikash");
		
		List<WebElement> names = driver.findElements(By.xpath("//span[contains(text(),'Bikash')]"));
		
		TreeSet ts = new TreeSet();
		for(int i = 0 ; i < names.size() ; i++)
		{
			ts.add(names.get(i).getText());
		}
		
		List list = new ArrayList(ts);	
		for(int i = 0 ; i < list.size() ; i++)
		{
			if(i==2)
			System.out.println(list.get(i));
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		/*
		 * System.out.println("str"+10+'A'-10+2*4); HashMap hm = new HashMap();
		 * 
		 * hm.put(12, "Men"); hm.put(11, "Lady");
		 * 
		 * Set<Integer> s = hm.keySet();
		 * 
		 * System.out.println(s); int sum = 0;
		 * 
		 * for(int i : s) { sum += i; } System.out.println(sum);
		 */
		
	}
}
