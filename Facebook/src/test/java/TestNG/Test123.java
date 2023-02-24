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




public class Test123 {
	
	@BeforeSuite
	  public void beforeSuite()
	  {
		  System.out.println("Before Suite-TestClass1");
		  
	  }
	
	@BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Before Test-TestClass1");
		  
	  }
	
	
	
	@BeforeClass
	  public void beforeClass()
	  {
		  System.out.println("Before Class-TestClass1");
		  
	  }
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method-TestClass1");
			
				
		}

		
	
		@Test
		public void  test2()
		{
			System.out.println("Test2-TestClass1");  
			
		}
		@Test
		public void  test3()
		{
			System.out.println("Test3-TestClass1");  
			
		}
		@Test
		public void  test4()
		{
			System.out.println("Test4-TestClass1");  
			
		}

		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("afterMethod-TestClass1");
			
		}

		
		@AfterClass
		public void afterClass()
		{
			System.out.println("afterClass-TestClass1");
		
		}
		
		@AfterTest
		  public void afterTest()
		  {
			  System.out.println("After Test-TestClass1");
			  
		  }

		
		@AfterSuite
		  public void afterSuite()
		  {
			  System.out.println("After Suite-TestClass1");
			  
		  }
		
	

	

}
