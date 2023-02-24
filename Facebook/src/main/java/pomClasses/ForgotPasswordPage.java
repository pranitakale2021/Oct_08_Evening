package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	@FindBy (xpath = "//div[text()='Please enter your email address or mobile number to search for your account.']")
	private WebElement forgotMessage;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement emailOrMobile;
	
	@FindBy (xpath = "(//a[@role='button'])[1]")
	private WebElement cancel;
	
	@FindBy (xpath = "//button[@value='1']")
	private WebElement search;
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
		public ForgotPasswordPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//Methods: Action on webElement: Login or Sign Up Page
		
		public void getForgotWindowMessage() 
		{
			String text=forgotMessage.getText();
			System.out.println(text);
		}
		
		public void sendPassword() 
		{
			emailOrMobile.sendKeys("12345");
			
		}
		public void clickOnCancelbutton() 
		{
			cancel.click();
			
		}
		public void clickOnSearchButton() 
		{
			search.click();
		}
			
	
	

}
