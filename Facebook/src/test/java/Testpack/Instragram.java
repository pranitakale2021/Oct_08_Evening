package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.InstragramForgotPassword3;
import pomClasses.InstragramLoginPage;
import pomClasses.InstragramLoginWithFacebook1;
import pomClasses.InstragramSignUpPage2;

public class Instragram {
  //WebDriver
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driverTest=new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driverTest.manage().window().maximize();
		
		
		driverTest.get("https://www.instagram.com/accounts/login/");
		
		InstragramLoginPage instragramLoginPage=new InstragramLoginPage(driverTest);
		instragramLoginPage.sendEmailOrPhoneNo();
		instragramLoginPage.sendPassword();
		instragramLoginPage.clickOnLoginButton(); 
		instragramLoginPage.clickOnFacebookLink();
		instragramLoginPage.clickOnForgotpasswordLink(); 
		instragramLoginPage.clickOnSignPage();
		
		
		//instragram forgotpassword
		InstragramForgotPassword3 instragramForgotPassword3=new InstragramForgotPassword3(driverTest);
		//instragramForgotPassword3.sendForgotpassword(); 
		instragramForgotPassword3.sendEmailphoneno(); 
		instragramForgotPassword3.clickOnLoginLink();
		instragramForgotPassword3.clickOnResetYourPassword();
		instragramForgotPassword3.clickOnBackToLogin();
		
		//Instragram loginwithFacebook
		InstragramLoginWithFacebook1 instragramLoginWithFacebook1=new InstragramLoginWithFacebook1(driverTest);
		instragramLoginWithFacebook1.sendEmailOrPhoneNo();
		instragramLoginWithFacebook1.sendpassword();
		instragramLoginWithFacebook1.clickOnLoginButton();
		instragramLoginWithFacebook1.clickOnForgottenAccountLink();
		instragramLoginWithFacebook1.clickOnSignUpForFacebookLink();
		instragramLoginWithFacebook1.clickOnNotNowLink();
		
		//Instragram SignupPage
		InstragramSignUpPage2 instragramSignUpPage2=new InstragramSignUpPage2(driverTest);
		instragramSignUpPage2.sendLoginWithFacebooAccount();
		instragramSignUpPage2.sendMobileNo();
		instragramSignUpPage2.sendFullName();
		instragramSignUpPage2.sendUserName();
		instragramSignUpPage2.sendPassword();
		instragramSignUpPage2.clickOnSignUpButton();
		instragramSignUpPage2.clickOnLogInButton();
		
	

	
	}

}
