package com.assignment;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//fetch all the links from google

public class Scen14 {

	@Test
	public void execute()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		
		for(WebElement ele : links)
		{
			System.out.println(ele.getText());
		}

		
	}
}
