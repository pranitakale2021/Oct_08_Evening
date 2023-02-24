package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pomClasses.InstragramLoginPage;

import pomClasses.InstragramSignUpPage2;


public class InstraNG
{
	WebDriver driverTest;
	@BeforeClass
	public void launchBrowser()
	  {
		  System.out.println(" Before Class");
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driverTest=new ChromeDriver();
		  driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driverTest.manage().window().maximize();
	  }
	
	@BeforeMethod
	  public void InstragramSignUpPage2()
	  {
		  System.out.println(" Before Method");
		  driverTest.get("https://www.instagram.com/accounts/login/");
		 // InstragramLoginPage instragramLoginPage=new InstragramLoginPage(driverTest);
		//  InstragramSignUpPage2 instragramSignUpPage2=new InstragramSignUpPage2(driverTest);
		//  driverTest.switchTo().window(addr.get(0));
		  //ArrayList<String>addr1 =new ArrayList<String>(driverTest.getWindowHandles());
		 // driverTest.switchTo().window(addr1.get(0));
	  }
	
	@Test
	public void test()
	{
		System.out.println("Test");
		  InstragramLoginPage instragramLoginPage=new InstragramLoginPage(driverTest);
		  instragramLoginPage.sendEmailOrPhoneNo();
		  instragramLoginPage.sendPassword();
		  instragramLoginPage.clickOnSignPage(); 
		  
		  InstragramSignUpPage2 instragramSignUpPage2=new InstragramSignUpPage2(driverTest);
		  instragramSignUpPage2.sendMobileNo();
		  instragramSignUpPage2.sendFullName();
		  instragramSignUpPage2.sendUserName();
		 instragramSignUpPage2.sendPassword();
		  
		 driverTest.navigate().back();
		
	     InstragramLoginPage instragramLoginPage1=new InstragramLoginPage(driverTest);
		 instragramLoginPage1.clickOnFacebookLink();
		
	}
	
	//@Test
	
	//public void LoginWithSignup()
	//{
		 // InstragramSignUpPage2 instragramSignUpPage2=new InstragramSignUpPage2(driverTest);
		//  instragramSignUpPage2.sendMobileNo();
		//  instragramSignUpPage2.sendFullName();
		//  instragramSignUpPage2.sendUserName();
		//  instragramSignUpPage2.sendPassword();
	//	  driverTest.navigate().back();
			
		//	 InstragramLoginPage instragramLoginPage1=new InstragramLoginPage(driverTest);
		//	 instragramLoginPage1.clickOnFacebookLink();
		  
		
		
  // }

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}

	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after Class");
	}


}
