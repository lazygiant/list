package com.assignment;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1 {

	@Test
	public void execute()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).click();
		List<WebElement> listOf = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		List<String> listText = new ArrayList();
		Collections.sort(listText);
		
		List<String> listTag = new ArrayList();
	
		
		for(WebElement web : listOf)
		{	
			listText.add(web.getText());
			listTag.add(web.getTagName());
		}
		
		for(String allList : listText)
		{
			System.out.println(allList);
		}
		
		for(String allList : listTag)
		{
			System.out.println(allList);
		}
	}
}
