package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pomClasses.ForgotPasswordPage;
import pomClasses.LoginOrSignUpPage;

public class TestNG2 
{

WebDriver driverTest;

@BeforeClass
  public void launchBrowser()
  {
	  System.out.println(" Before Class");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	  driverTest=new ChromeDriver();
	  driverTest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driverTest.manage().window().maximize();
  }
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		  driverTest.get("https://www.facebook.com/");
		  LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage (driverTest);
	      loginOrSignUpPage.openSignUpForm();
	      ForgotPasswordPage forgotPasswordPage =new ForgotPasswordPage(driverTest);
	      forgotPasswordPage.clickOnSearchButton();	  
			
	}

	
	@Test
	public void  emailOrMobile()
	{
		System.out.println("Test");
	    ForgotPasswordPage forgotPasswordPage =new ForgotPasswordPage(driverTest);
	    forgotPasswordPage.sendPassword();
	    forgotPasswordPage.clickOnSearchButton();
	    
	    
	    
	   
		
	}

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		//driverTest.close();
	}

	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class");
		//driverTest.quit();
	}


}
