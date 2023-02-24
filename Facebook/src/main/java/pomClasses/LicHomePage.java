package pomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicHomePage 
{
	@FindBy (xpath = "(//a[@href='/Home-(1)/Customer-Portal'])[1]")
	private WebElement loginToCustomerPortal;
	
//	private WebDriver driver;
	
	public LicHomePage (WebDriver driver)//driver=driverTest=new ChromeDriver()
	{
		PageFactory.initElements(driver,this);
	//	this.driver=driver;
	}

	//Methods: Action on webElement: Login or Sign Up Page
	
	
	public void clickOnCustomerPortal() 
	{
		loginToCustomerPortal.click();
		
	}

}
