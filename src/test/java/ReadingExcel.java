import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingExcel {

	@Test
	public void readingExcel() throws Exception
	{
		String path = "C:\\biiii\\ExcelFile.xlsx";
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.name("q")).sendKeys("Bikash");
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Bikash')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		FileInputStream fileIn = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fileIn);
		
		FileOutputStream fileOut = new FileOutputStream(path);
		System.out.println(list.size());
		
		for(WebElement ele : list)
		{
			String values = ele.getText();
			System.out.println(values);
			for(int i = 1 ; i <= list.size() ; i++)
			{
				Sheet s = wb.getSheet("Sheet1");
				s.createRow(i).createCell(0).setCellValue(values);
				wb.write(fileOut);
			}
		}
		
		wb.close();
		driver.close();
		
	}
}
