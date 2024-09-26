package com.demo;

import java.time.Duration;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo
{

	@Test
	public void demo() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Bikash");
		List<WebElement> auto = driver.findElements(By.xpath("//span[contains(text(),'Bikash ')]"));
		
		TreeSet<String> tree = new TreeSet();
		
		for(int i =  0 ; i<auto.size(); i++)
		{
			String text = auto.get(i).getText();
			tree.add(text);
			System.out.println(text);
		}
		
		List list = new ArrayList(tree);
		System.out.println(list.get(2));
		
		
		
		
		
		
		
		
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 * driver.get("https://www.clinique.in/");
		 * 
		 * WebElement frame1 =
		 * driver.findElement(By.xpath("//iframe[@name='ibmOptinFrame']"));
		 * 
		 * driver.switchTo().frame(frame1);
		 * 
		 * driver.findElement(By.xpath("//button[@id='dismissBtn']")).click();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * driver.findElement(By.
		 * xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]"
		 * )).click(); driver.findElement(By.className("dismiss")).click();
		 */
	
		// moving to skincare
		
		/*
		 * WebElement skincare = driver.findElement(By.xpath(
		 * "//div[@class='gnav-desktop-nav-item']/child::a[contains(text(),'Skincare')]"
		 * )); Actions move = new Actions(driver);
		 * move.moveToElement(skincare).perform();
		 * 
		 * List<WebElement> skins = driver.findElements(By.
		 * xpath("//a[contains(text(),'All Skincare')]/following-sibling::a"));
		 * 
		 * Thread.sleep(2000); System.out.println(skins.size());
		 */
		
		//		String s = "banana";
		//		char ch[]= s.toCharArray();
		//		
		//		
		//		HashMap<Character, Integer> map = new HashMap();
		//		
		//		for(char c : ch )
		//		{
		//			if(!map.containsKey(c))
		//			{
		//				map.put(c, 1);
		//			}
		//			else
		//			{
		//			    int count = map.get(c);
		//				map.put(c, count+1);
		//			}
		//		}
		//		
		//		
		//	for(Map.Entry<Character, Integer> o1:map.entrySet())
		//	{
		//		if(o1.getValue()==1)
		//		System.out.println(o1.getKey()+" "+o1.getValue());
		//	}





		//		Set set = map.entrySet();
		//		
		//		Iterator itr = set.iterator();
		//		
		//		while(itr.hasNext())
		//		{
		//			System.out.println(itr.next());
		//			
		//		}



	}
}
