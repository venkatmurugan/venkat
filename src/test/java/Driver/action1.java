package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action1 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 
		//switching the frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		//
		Actions act =new Actions(driver);
		act.dragAndDrop(src,dest).build().perform();
		Thread.sleep(2000);
		//
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.linkText("Demos")).click();
		//Assert.assertTrue(driver.getTitle().contains("Demos"));
		//driver.close();
		
		
		
		
  }
}
