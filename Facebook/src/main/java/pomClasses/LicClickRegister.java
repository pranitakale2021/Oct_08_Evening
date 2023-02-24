package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicClickRegister
{
	
		@FindBy (xpath = "//a[text()='New User']")
		private WebElement newUserbutton;
		
		
		@FindBy (xpath = "(//a[@class='button'])[2]")
		private WebElement registeredButton;
		
		
		//private WebDriver driver;
		
		public LicClickRegister (WebDriver driver)//driver=driverTest=new ChromeDriver()
		{
			PageFactory.initElements(driver,this);
		//	this.driver=driver;
		}

		//Methods: Action on webElement: Login or Sign Up Page
		
		
		public void clickOnNewUserbutton() 
		{
			newUserbutton.click();
			
		}
		
		public void clickRegisteredbutton() 
		{
			registeredButton.click();
			
		}



}

