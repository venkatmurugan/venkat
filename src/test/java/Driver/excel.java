package Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excel {
  @Test
  public void f() throws IOException 
  {
	  File src=new File("C:\\Users\\venkatesh.murugan\\Desktop\\venkatesh.xlsx");
	  FileInputStream fis=new  FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  int lastrow=sheet1.getLastRowNum();
	  System.out.println(lastrow);
	  
	  for(int i=0;i<=lastrow;i++)
	  {
		  String um=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(um);
			String psd= sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(psd);
			
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			  driver.get("http://newtours.demoaut.com");
			  
			  driver.findElement(By.name("userName")).sendKeys(um);
			  driver.findElement(By.name("password")).sendKeys(psd);
			  driver.findElement(By.name("login")).click();
			 // driver.close();
	  }
	  wb.close();
  }
}
