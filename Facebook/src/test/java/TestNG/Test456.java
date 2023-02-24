package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test456 {
	
	
	@BeforeSuite
	  public void beforeSuite()
	  {
		  System.out.println("Before Suite-TestClass2");
		  
	  }
	
	@BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Before Test-TestClass2");
		  
	  }
	
	
		@BeforeClass
		  public void beforeClass()
		  {
			  System.out.println("Before Class-TestClass2");
			  
		  }
			
			@BeforeMethod
			public void beforeMethod()
			{
				System.out.println("Before Method-TestClass2");
				
					
			}

			
			@Test
			public void  testA()
			{
				System.out.println("TestA-TestClass2");  
				
			}
			@Test
			public void  testB()
			{
				System.out.println("TestB-TestClass2");  
				
			}
			@Test
			public void  testC()
			{
				System.out.println("TestC-TestClass2");  
				
			}
			@Test
			public void  testD()
			{
				System.out.println("TestD-TestClass2");  
				
			}

			
			@AfterMethod
			public void afterMethod()
			{
				System.out.println("afterMethod-TestClass2");
				
			}

			
			@AfterClass
			public void afterClass()
			{
				System.out.println("afterClass-TestClass2");
			
			}
			
			
			
			@AfterTest
			  public void afterTest()
			  {
				  System.out.println("After Test-TestClass2");
				  
			  }
			
			@AfterSuite
			  public void afterSuite()
			  {
				  System.out.println("After Suite-TestClass2");
				  
			  }


		

	}



