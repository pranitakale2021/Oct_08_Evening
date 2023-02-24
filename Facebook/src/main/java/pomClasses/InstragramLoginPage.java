package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstragramLoginPage {
	
	@FindBy (xpath = "(//input[@autocapitalize='off'])[1]")
	private WebElement phonenoemailid;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath="//span[text()='Log in with Facebook']")
	private WebElement loginwithFacebookLink ;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink ;
	
	@FindBy(xpath="//span[text()='Sign up']")
	private WebElement signUp ;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
		public InstragramLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//Methods: Action on webElement: Login or Sign Up Page
		
		public void sendEmailOrPhoneNo() 
		{
			phonenoemailid.sendKeys("Pranitak");
			
		}
		public void sendPassword() 
		{
			password.sendKeys("1234");
		}
		public void clickOnLoginButton() 
		{
			loginButton.click();
		}
		public void clickOnFacebookLink()
		{
			loginwithFacebookLink.click();
		}
		public void clickOnForgotpasswordLink() 
		{
			forgotPasswordLink.click();
		}
		public void clickOnSignPage()
		{
			signUp.click();
		}
		
}
    