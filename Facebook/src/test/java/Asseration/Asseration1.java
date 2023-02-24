package Asseration;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration1 

{
	@Test
	public void m1()
	{
		String a="coding with mk";
		String b="coding with mk";
		
		Assert.assertEquals(a, b);
		System.out.println("First hard assert is pass");
		
		String c="coding with mk";
		String d="coding with mk in class";
		
		Assert.assertEquals(c, d);
		System.out.println("First hard assert is pass");
		
		String e="coding with mk";
		String f="coding with mk";
		
		Assert.assertEquals(e, f);
		System.out.println("First hard assert is pass");
		
		
		
		
		
		
		
		
		
		
	
	}
}





// System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
//  WebDriver driver=new ChromeDriver();
//  driver.get("https://testautomationpractice.blogspot.com/");
  
 // System.out.println("verifying title...");
 // String actualUrl="https://testautomationpractice.blogspot.com/";
 // String expectedURl="https://testautomationpractice.blogspot.com/.home";
  //Assert.assertEquals(actualUrl, expectedURl);
  //Assert.assertEquals(actualUrl,expectedURl,"Homepage URL is not found");
//  Assert.assertNotEquals(actualUrl,expectedURl,"Homepage URL is not found");

