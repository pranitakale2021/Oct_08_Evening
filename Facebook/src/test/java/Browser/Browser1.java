package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser1 
{
	public static WebDriver OpenChromeBrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
	 return driver;
	}
	
	public static WebDriver OpenExploarEdge() {
		 System.setProperty("webdriver.edge.driver","C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
	     WebDriver driver= new EdgeDriver();
		 return driver;
	}
		 
		
	 
}
