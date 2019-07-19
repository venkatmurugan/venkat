package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action2 {
  @Test
  public void f() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
		// Assert.assertTrue(driver.getTitle().contains("demowebshop"));
		 
		 
		// driver.get("http://10.232.237.143:443/TestMeApp");
		// WebElement aboutus=driver.findElement(By.xpath("//a/span[Contains(text(),'AboutUs']"));
		// WebElement office=driver.findElement(By.xpath("//a/span[Contains(text(),'Our Offices']"));
		//WebElement chennai=driver.findElement(By.xpath("//a/span[Contains(text(),'Chennai']"));
		 
		 WebElement search=driver.findElement(By.id("small-searchterms"));
		 search.sendKeys("computer");
		 //Thread.sendKeys(2000);
		 //id="small-searchterms"
		 System.out.println("SEARCH");
		 Actions action=new Actions(driver);
		// action.moveToElement(aboutus).moveToElement(office).moveToElement(chennai).build().perform();
		// action.moveToElement(search).sendKeys("computer").build().perform();
		 System.out.println("SEARCH1");
		 action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
		 System.out.println("SEARCH2");
		 //Thread.sleep(2000)
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 
  }
}
