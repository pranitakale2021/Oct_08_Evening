package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{  
		//launch browser
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  //open url
		  driver.get("https://www.google.com/");
		  
		  //maximise browser
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	
	@Test(dataProvider="searchdataProvider")
	
	public void searchkeyWord(String keyword)
	{
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	@DataProvider(name="searchdataProvider")
	public Object[][] searchDataProviderMethod()
	{
		Object[][] searchData= new Object[2][1];
		searchData[0][0]="Taj Mahal";
		searchData[1][0]="India Gate";
		return searchData;
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
