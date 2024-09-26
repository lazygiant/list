package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// open yatra.com and click on depart date[ identify may 22 date 3 don't hardcode 3 ]
public class Scen4 {

	@Test
	public void execute()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.name("flight_origin_date")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//div[@class='body-right BE_flight_origin_date']/div/following-sibling::div/descendant::td[@id='20/09/2024']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.close();
	}
}
