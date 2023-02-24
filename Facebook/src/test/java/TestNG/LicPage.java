package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.CreateLicAccount;
import pomClasses.LicClickRegister;
import pomClasses.LicHomePage;

public class LicPage {
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
		  driverTest.get("https://licindia.in/");
	
	  }
	
	@Test
	public void test()
	{
		System.out.println("Test");
		LicHomePage licHomePage=new LicHomePage(driverTest);
		licHomePage.clickOnCustomerPortal();
		
		LicClickRegister licClickRegister =new LicClickRegister(driverTest);
		licClickRegister.clickOnNewUserbutton();
		//licClickRegister.
		CreateLicAccount createLicAccount=new CreateLicAccount(driverTest);
		createLicAccount.clickOnPolicyNumber();
		createLicAccount.clickOnInstalmentPrem();
	//	createLicAccount.clickOnBirthDate();
	//	createLicAccount.clickOnBirthDate();
	//	createLicAccount.clickOnBirthMonth();
	//	createLicAccount.clickOnBirthYear();
	//	createLicAccount.clickOnCountryCode();
		createLicAccount.clickOnMobileNumber();
		createLicAccount.clickOnEmailId();
		createLicAccount.clickOnPassportNumber();
		createLicAccount.clickOnPanNumber();
		createLicAccount.clickOnGender();
		createLicAccount.clickCheckBox();
		createLicAccount.clicksignIn();
	//	driverTest.navigate().back();
		
	}
	
	

	
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


