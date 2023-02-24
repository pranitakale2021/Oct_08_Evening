package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	//variable: webElement: Login Or Sign Up Page
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement emailOrPhoneNo;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@value='1']")
	private WebElement loginbutton;
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement CreateNewAccountButton;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath = "//a[@class='_8esh']")
	private WebElement createapage;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Methods: Action on webElement: Login or Sign Up Page
	
	public void sendEmailOrPhoneNo() 
	{
		emailOrPhoneNo.sendKeys("Pranitak");
		
	}
	public void sendPassword() 
	{
		password.sendKeys("1234");
		
	}
	public void clickonLoginButton() 
	{
		loginbutton.click();
		
	}
	public void openSignUpForm() 
	{
		CreateNewAccountButton.click();
		
	}
	public void clickonForgotPassword() 
	{
		forgotPasswordLink.click();
		
	}
	public void clickoncreateapage() 
	{
		createapage.click();
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
