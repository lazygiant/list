import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex3 {

   @Test
   public void execute()
   {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   driver.get("https://www.yahoo.com/");
	   driver.findElement(By.name("p")).sendKeys("modi",Keys.ENTER);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   Set<String> set = driver.getWindowHandles();
	   Iterator<String> itr = set.iterator();
	   
	   //String parent = itr.next();
	   String child = itr.next();
	   
	   driver.switchTo().window(child);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   driver.findElement(By.xpath("//a[text()='Narendra Modi - Wikipedia']")).click();
	   
	  
   }
}
