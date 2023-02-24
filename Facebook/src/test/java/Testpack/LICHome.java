package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.CreateLicAccount;
import pomClasses.LicClickRegister;
import pomClasses.LicHomePage;

public class LICHome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://licindia.in/");
		
		LicHomePage licHomePage=new LicHomePage(driverTest);
		licHomePage.clickOnCustomerPortal();
		
		//registered page
		LicClickRegister licClickRegister =new LicClickRegister(driverTest);
		licClickRegister.clickOnNewUserbutton();
		//LicClickRegister licClickRegister =new LicClickRegister(driverTest);
		licClickRegister.clickRegisteredbutton();
   
		CreateLicAccount createLicAccount=new CreateLicAccount(driverTest);
		createLicAccount.clickOnPolicyNumber();
	
		createLicAccount.clickOnInstalmentPrem();
	
		//createLicAccount.clickOnBirthDate();
		createLicAccount.clickOnBirthDate();
		//createLicAccount.clickOnBirthMonth();
		//createLicAccount.clickOnBirthYear();
		
		
		createLicAccount.clickOnCountryCode();
		
		
		createLicAccount.clickOnMobileNumber();
		
		
		createLicAccount.clickOnEmailId();
		
	
		createLicAccount.clickOnPassportNumber();
		
	
		createLicAccount.clickOnPanNumber();
		
	
		createLicAccount.clickOnGender();
		createLicAccount.clickCheckBox();
		createLicAccount.clicksignIn();
		
		
		
		
		
		
		
		
	}

}
