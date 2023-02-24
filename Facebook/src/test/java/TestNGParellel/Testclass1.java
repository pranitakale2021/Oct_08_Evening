package TestNGParellel;

import java.util.concurrent.TimeUnit; //para1.xml suit used

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.CreateNewAccount;
import pomClasses.ForgotPasswordPage;
import pomClasses.LoginOrSignUpPage;

public class Testclass1 {
	
	
	
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) 
	{
	System.out.println(browserName);
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\newchrome\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver =new ChromeDriver();
	}
	
	if(browserName.equals("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
	    driver =new EdgeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		  driver.get("https://www.facebook.com/");
		  LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage (driver);
	      loginOrSignUpPage.openSignUpForm();
	      ForgotPasswordPage forgotPasswordPage =new ForgotPasswordPage(driver);
	      forgotPasswordPage.clickOnSearchButton();	  
			
	}
	@Test
	  public void term()
	  {
		  System.out.println(" Test");
		//  loginOrSignUpPage.sendEmailOrPhoneNo(); 
		//  SignUpPage signUpPage=new SignUpPage(driverTest)
		  CreateNewAccount createNewAccount =new CreateNewAccount(driver);
		//  SignUpPage.clickTerms();
		  createNewAccount.clickOntermslinkbutton();
		  String url=driver.getCurrentUrl();
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
		  CreateNewAccount createNewAccount =new CreateNewAccount(driver);
		//  SignUpPage.clickTerms();
		  createNewAccount.clickOnprivacypolicybutton();
		  String url=driver.getCurrentUrl();
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
		  CreateNewAccount createNewAccount =new CreateNewAccount(driver);
		//  SignUpPage.clickTerms();
		  createNewAccount.clickOncookiesPolicy();
		  String url=driver.getCurrentUrl();
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



	/*@Test
	public void testMethod1()
	{
		System.out.println("TestClass1 >> testMethod1 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("TestClass1 >> testMethod2 >>" +Thread.currentThread().getId());	
	}
	
	
	@Test
	public void testMethod3()
	{
		System.out.println("TestClass1 >> testMethod3 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod4()
	{
		System.out.println("TestClass1 >> testMethod4 >>" +Thread.currentThread().getId());	
	}*/
	




