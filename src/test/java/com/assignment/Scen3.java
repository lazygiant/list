package com.assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// write the xpath for 1st checkbox just right to that selected washing machine product
// under ass a protection
public class Scen3 {

	@Test
	public void execute() throws Exception
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("washing machine");
        searchBox.submit();
        Thread.sleep(3000);  
        
        driver.findElement(By.xpath("//span[contains(text(),'Godrej 6.5 Kg 5 Star ')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        System.out.println(1);
        String parentWindow = iterator.next();

        System.out.println(2);
        String childWindow = iterator.next();

        System.out.println(3);
        driver.switchTo().window(childWindow);
        System.out.println(driver.getCurrentUrl());

        // Wait for the page to load
        Thread.sleep(2000);
        
        System.out.println(4);
        WebElement capacity = driver.findElement(By.xpath("//span[text()='6.5 Kilograms']"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    	Assert.assertEquals(capacity.getText(), "6.5 Kilograms");
    	
    	// Selecting first checkbox and add into protection plan
    	
    	driver.findElement(By.id("mbb-offeringID-1")).click(); // selecting the first checkbox 
    	driver.findElement(By.name("submit.add-to-cart")).click(); // clicking on ADD-TO-CART
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    	
    	
    	
	}
}
