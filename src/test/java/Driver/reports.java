package Driver;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class reports 
{
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
  @Test
  public void f() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  if(driver.getTitle().contains("mercury"))
		  {
			  test.log(LogStatus.PASS,"Login Passed","Login successfully");
		  }
		  else 
		  {
			 // test.log(LogStatus.FAIL,"Login failed","Login is not excuted successfully");
			  test.log(LogStatus.FAIL, test.addScreenCapture(capture.takescreenshot(driver)),"Login is not executed successfully");

		  }
		  driver.close();
  }
  @BeforeClass
  public void beforeClass() 
  {
	  report=new ExtentReports("C:\\selenium\\myreport.html",false);
	  test=report.startTest("reportscreation");
  }

  @AfterClass
  public void afterClass() 
  {
	  report.flush();
	  report.endTest(test);
  }

}
