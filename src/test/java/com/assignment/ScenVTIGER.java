package com.assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScenVTIGER {

	WebDriver driver = new ChromeDriver();
	@Test
	public void execute()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		Set<String> list = driver.getWindowHandles();
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String sid=itr.next();
			String title=driver.switchTo().window(sid).getTitle();
			System.out.println(title);
			
			if(title.contains("module=Accounts"))
			{
				break;
			}
		}
		
		
		driver.findElement(By.id("search_txt")).sendKeys("stocks");
		
		
	}
}
