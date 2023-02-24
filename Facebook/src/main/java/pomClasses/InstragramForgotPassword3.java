package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstragramForgotPassword3 {
	@FindBy (xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	//@FindBy(xpath="//input[@class='_aaie _aaig _adrq _aaic _ag7n']")
	//private WebElement emailPhoneNo;
	
	@FindBy(xpath="//input[@class='_aaie _aaig _adrq _aaic _ag7n']"1235)
	private WebElement emailPhoneNonumber;
	
	@FindBy(xpath="//button[text()='Send login link']")
	private WebElement sendLoginLink;
	
	
	@FindBy(xpath="(//a[@tabindex='0'])[2]")
	private WebElement cannotresetyourPassword;
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBy(xpath="//a[text()='Back to login']")
	private WebElement backtoLogin;
	
	
	
	
	//Constructor: Initialization of webElement: Login or Sign up Page
	
			public InstragramForgotPassword3(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}

				//Methods: Action on webElement: Login or Sign Up Page
					
			public void sendForgotpassword() 
				{
				forgotPassword.sendKeys("12345");
						
				}
			public void sendEmailphoneno() 
			{
				emailPhoneNo.sendKeys("123456");
					
			}
			public void clickOnLoginLink() 
			{
				sendLoginLink.click();
					
			}
			public void clickOnResetYourPassword() 
			{
				cannotresetyourPassword.click();
					
			}
			public void clickOnBackToLogin() 
			{
				backtoLogin.click();
					
			}
			

}
