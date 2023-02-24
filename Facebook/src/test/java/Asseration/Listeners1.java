package Asseration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Listeners1 
{
	@Test
	public void login()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		 //open url
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      //webelement
		 WebElement userButton=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 userButton.sendKeys("Admin");
		 WebElement passWord=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 passWord.sendKeys("admin123");
		 
		 WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		 loginButton.click();
		 
		 Assert.assertEquals(driver.getCurrentUrl(), "OrangeHRM");
	}
	@Test
		 public void testFail()
		 {
			System.out.println("Failed test case");
			Assert.assertTrue(false);
		 }
	
	}
		





