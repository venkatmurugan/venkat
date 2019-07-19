package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase2 {
	//WebDriver ff;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	 WebDriver ff=new ChromeDriver();
	  ff.get("http://newtours.demoaut.com");
	  String login1=ff.getTitle();
	  System.out.println(login1);
	  
	  
	  ff.findElement(By.name("userName")).sendKeys("mercury");
	  ff.findElement(By.name("password")).sendKeys("mercury");
	  ff.findElement(By.name("login")).click();
	  ff.findElement(By.xpath("//input[@value='oneway']")).click();
	  
	  
	  String login=ff.getTitle();
	  System.out.println(login);
	  
	  
	  Assert.assertEquals(login,"Find a Flight: Mercury Tours:");
	  Select passenger=new Select (ff.findElement(By.name("passCount")));
	  passenger.selectByIndex(1);
	  
	  Select a=new Select (ff.findElement(By.name("fromPort")));
	  a.selectByIndex(1);
	  
	  Select c=new Select (ff.findElement(By.name("fromMonth")));
	  c.selectByIndex(3);
	  
	  Select d=new Select (ff.findElement(By.name("fromDay")));
	  d.selectByIndex(3);
	  
	  Select e=new Select (ff.findElement(By.name("toMonth")));
	  e.selectByIndex(6);
	  
	  Select f=new Select (ff.findElement(By.name("toDay")));
	  f.selectByIndex(6);
	  
	  
	  
	  Select b=new Select (ff.findElement(By.name("toPort")));
	  b.selectByIndex(2);
	  
	  ff.findElement(By.xpath("//input[@value='Business']")).click();
	  
	  Select g=new Select (ff.findElement(By.name("airline")));
	  g.selectByIndex(2);
	  
	  ff.findElement(By.name("findFlights")).click();
	  
	  String login2=ff.getTitle();
	  System.out.println(login2);
	  //ff.findElement(By.linkText("SIGN-OFF")).click();
  }
}
