package TestNGParellel;

import org.testng.annotations.Test;

public class Testclass3 {
	@Test
	public void testMethod9()
	{
		System.out.println("TestClass3 >> testMethod1 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod10()
	{
		System.out.println("TestClass3 >> testMethod2 >>" +Thread.currentThread().getId());	
	}
	
	
	@Test
	public void testMethod11()
	{
		System.out.println("TestClass3 >> testMethod3 >>" +Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod12()
	{
		System.out.println("TestClass3 >> testMethod4 >>" +Thread.currentThread().getId());	
	}
	

}


