package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.CreateNewAccount;
import pomClasses.LoginOrSignUpPage;

public class TestNG1 {
	
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
		  public void goToSignUpForm()
		  {
			  System.out.println(" Before Method");
			  driverTest.get("https://www.facebook.com/");
			  LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage (driverTest);
			  loginOrSignUpPage.openSignUpForm();
			  CreateNewAccount createNewAccount =new CreateNewAccount(driverTest);
			  createNewAccount.clickOnCreateButton();
		  }


		@Test
		  public void term()
		  {
			  System.out.println(" Test");
			//  loginOrSignUpPage.sendEmailOrPhoneNo(); 
			//  SignUpPage signUpPage=new SignUpPage(driverTest)
			  CreateNewAccount createNewAccount =new CreateNewAccount(driverTest);
			//  SignUpPage.clickTerms();
			  createNewAccount.clickOntermslinkbutton();
			  String url=driverTest.getCurrentUrl();
			  if(url.equals("djsgfjd"))
			  {
				  System.out.println("PASS");
			  }
			  else
			  {
				  System.out.println("FAIL");
			  }
		  }
		
		@Test
		  public void privacyPolicy()
		  {
			  System.out.println(" Test");
			//  loginOrSignUpPage.sendEmailOrPhoneNo(); 
			//  SignUpPage signUpPage=new SignUpPage(driverTest)
			  CreateNewAccount createNewAccount =new CreateNewAccount(driverTest);
			//  SignUpPage.clickTerms();
			  createNewAccount.clickOnprivacypolicybutton();
			  String url=driverTest.getCurrentUrl();
			  if(url.equals("asbdf"))
			  {
				  System.out.println("PASS");
			  }
			  else
			  {
				  System.out.println("FAIL");
			  }
		  }
		
		@Test
		  public void cookiesPolicy()
		  {
			  System.out.println(" Test");
			//  loginOrSignUpPage.sendEmailOrPhoneNo(); 
			//  SignUpPage signUpPage=new SignUpPage(driverTest)
			  CreateNewAccount createNewAccount =new CreateNewAccount(driverTest);
			//  SignUpPage.clickTerms();
			  createNewAccount.clickOncookiesPolicy();
			  String url=driverTest.getCurrentUrl();
			  if(url.equals("cvbnjggj"))
			  {
				  System.out.println("PASS");
			  }
			  else
			  {
				  System.out.println("FAIL");
			  }
		  }

		@AfterMethod
		  public void afterMethod()
		  {
			  System.out.println(" After Method");
			 
			//  driverTest.close();
		  }

		@AfterClass
		  public void afterClass()
		  {
			  System.out.println(" After Class");
		  }

		
		
	}


