package TestNGParellel;

import org.testng.annotations.Test;

public class Testclass2 {

	@Test
	public void testMethod5()
	{
		System.out.println("TestClass2 >> testMethod1 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod6()
	{
		System.out.println("TestClass2 >> testMethod2 >>" +Thread.currentThread().getId());	
	}
	
	
	@Test
	public void testMethod7()
	{
		System.out.println("TestClass2 >> testMethod3 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod8()
	{
		System.out.println("TestClass2 >> testMethod4 >>" +Thread.currentThread().getId());	
	}
	

}


