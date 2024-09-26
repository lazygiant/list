package com.assignment;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// open flip-kart and get all autosuggestions and print in descending order

public class Scen12 {

	@Test
	public void execute() 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.name("q")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='YGcVZO']"));
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Collections.reverse(list);
		
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
		
		
		
	}
}
