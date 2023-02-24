package TestNG;



import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Utility;



public class Screenshot {
	WebDriver driver;

	@BeforeTest
	  public void launchBrowser()
	  {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\newchrome\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  driver.get("https://www.mayoclinic.org/");
		  driver.manage().window().maximize();
	  }
		
		
		
		@Test
		public void  VerifyWebTitle()
		{
			String ActualWebTitle=driver.getTitle();
			String ExpectedWebTitle="Maya Clinic - Mayo Clinicfew";
			Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
		}
		
		@AfterMethod
		public void Aftermethod(ITestResult result)throws IOException
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				//File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   // File dest=new File("C:\\Users\\admin\\OneDrive\\Desktop\\velocity\\Test123\\Test1.png");
			   // FileHandler.copy(screenshot, dest);
				Utility.TakingScreenshot(driver, result.getName());
				
			
			}
				
				
				
		}
}
		
		
	

		



