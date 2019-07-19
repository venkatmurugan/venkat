package Driver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
public class NewDriver 
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.partialLinkText("SignIn")).click();
	  //enter username as lalitha
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  //enter password as password@123
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  //click login
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  //search
	  driver.findElement(By.name("products")).sendKeys("Hand Bag");
	  //find details
	  //driver.findElement(By.id("FIND DETAILS")).click();
	// driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 driver.findElement(By.partialLinkText("FIND DETAILS")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  
  }

  @AfterMethod
  public void afterMethod() 
  { 
	 //driver.close(); 
  }

}
