package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.ForgotPasswordPage;
import pomClasses.LoginOrSignUpPage;

public class Loginup {
	WebDriver driver;
	SignUpPage signUpPage;
	LoginOrSignUpPage loginOrSignUpPage;
	
	
	
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			System.setProperty("WebDriver.chrome.driver","");
			driver=new ChromeDriver();
		}
		
		if(browserName.equals("Firefox"))
		{
			System.setProperty("WebDriver.gecko.driver","");
			driver=new FirefoxDriver();
		}
		
		if(browserName.equals("Opera"))
		{
			System.setProperty("WebDriver.opera.driver","");
			driver=new OperaDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
		

	@BeforeClass
	  public void createPOMObjects()
	  {
		signUpPage=new SignUpPage(driver);
		loginOrSignUpPage =new LoginOrSignUpPage(driver);
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
			System.out.println("after method");
		}

		
		@AfterClass
		public void clearPOMObjects()
		{
			signUpPage=null;
			loginOrSignUpPage=null;
		}

		
		@AfterTest
		public void closedBrowser()
		{
			driver.close();
			driver=null;
			System.gc();//garbage collector
		}


	}

}
