package CrossBrodemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browserName)
	{
		System.out.println(browserName);
		//if(browserName.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\newchrome\\chromedriver_win32 (2)\\chromedriver.exe");
		     driver= new ChromeDriver();
		}
		 if(browserName.equals("Edge"))
		 {
		    System.setProperty("webdriver.edge.driver","C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
			  driver=new EdgeDriver(); 
		  }
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
				      	 
	}
	
	    
	
	
	@Test
	public void verifyTitle()
	{
		//open url
		driver.get("http://www.google.com");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
	@AfterMethod
	public void TestC()
	{
		System.out.println("TestC");
		//driver.quit();
	}
	

}
