package Asseration;//listerns method

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class List1 
{
	
	public class Reporting{
	
		@Test
		public void Test_Sucess()
		{
			System.out.println("This is my success sceniro");
		}
		
		@Test
		public void Test_Failure()
		{
			System.out.println("This is my Failure sceniro");
			Assert.assertTrue(false);
		}
		
		
		@Test
		public void Test_Skipped()
		{
			throw new SkipException("This is my skipped sceniro");
		}
	
		
		
	}
}


