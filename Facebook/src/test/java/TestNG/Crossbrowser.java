package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser.Browser1;
import pomClasses.InstragramLoginPage;
import pomClasses.InstragramSignUpPage2;

public class Crossbrowser extends Browser1 {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	  {
		  System.out.println( browserName);
		  System.out.println( browserName);
		  if(browserName.equals("Chrome"))
		  {
			 // driver=Browser1.OpenChromeBrowser();
			  driver= OpenChromeBrowser();
			  
			  //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			 // driver=new ChromeDriver(); 
				  
		  }
		  
		  if(browserName.equals("Edge"))
		  {
			 
			 // System.setProperty("webdriver.chrome.driver","C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
			 // driver=new EdgeDriver(); 
			 // driver=Browser1.OpenExploarEdge();
			  driver= OpenExploarEdge();
		  }
			  
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	
	@BeforeClass
	  public void InstragramSignUpPage()
	  {
		  System.out.println(" Before Class");
		  driver.get("https://www.instagram.com/accounts/login/");
		
	  }
	
	@BeforeMethod
	  public void InstragramSignUpPage2()
	  {
		  System.out.println(" Before Method");
		//  driver.get("https://www.instagram.com/accounts/login/");
		
	  }
	@Test
	public void test()
	{
		System.out.println("Test");
		  InstragramLoginPage instragramLoginPage=new InstragramLoginPage(driver);
		  instragramLoginPage.sendEmailOrPhoneNo();
		  instragramLoginPage.sendPassword();
		  instragramLoginPage.clickOnSignPage(); 
		  
		  InstragramSignUpPage2 instragramSignUpPage2=new InstragramSignUpPage2(driver);
		  instragramSignUpPage2.sendMobileNo();
		  instragramSignUpPage2.sendFullName();
		  instragramSignUpPage2.sendUserName();
		 instragramSignUpPage2.sendPassword();
		  
		 driver.navigate().back();
		
	     InstragramLoginPage instragramLoginPage1=new InstragramLoginPage(driver);
		 instragramLoginPage1.clickOnFacebookLink();
		
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}

	
	@AfterClass
	public void InstragramLoginPage()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();  //garbage collector
	}


}


