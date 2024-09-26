package com.assignment;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scen8 
{
	@Test
	public void execute()
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.icc-cricket.com/");
		driver.findElement(By.xpath("//a[@alt='Rankings']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//a[@alt='womens-team-rankings']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//div[@id='onetrust-banner-sdk']/descendant::button[text()='Reject All']")).click();
		WebElement SMIRIT = driver.findElement(By.xpath("//a[@class='si-player-name-wrap']/descendant::span[text()='Smriti']"));
		
		System.out.println(SMIRIT.getText());
	}
}
