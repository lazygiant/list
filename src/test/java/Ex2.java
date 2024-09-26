import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex2 {

	@Test
	public void execute()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bikash");
		List<WebElement> alist = driver.findElements(By.xpath("//span[contains(text(),'bikash')]"));
		ArrayList<String> list = new ArrayList<String>();
		for(WebElement lele : alist)
		{ 
			list.add(lele.getText()); 
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
