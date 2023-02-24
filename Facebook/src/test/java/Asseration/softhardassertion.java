z	`1package Asseration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softhardassertion {
	
	
	@Test
	public void  testA()
	{
		System.out.println("TestA-TestClass1");  
	
	String actualUrl="https://www.facebook.com/";
	String expectedURl ="https://www.facebook.com/home";
	
	SoftAssert soft =new SoftAssert();
	//1.To comapare the data
	//2.create the result
	//If actual data is Equals to expected data then Test Case is Passed
	//If actual data is not Equals to expected data then Test Case is Passed
    soft.assertEquals(actualUrl,expectedURl, "Homepage URL is not found");
    
    //to compare the data
    //create the result
    //If actual data is Equals to expected data then Test Case is failed
	//If actual data is not Equals to expected data then Test Case is Passed
    soft.assertNotEquals(actualUrl,expectedURl, "Homepage URL is not found");
	
	boolean result= actualUrl.equals(expectedURl);
	
	//create the result
	//If result==true then test case passed
	//If result==false then test case failed
	soft.assertTrue(result, "Homepage URL is not found");
	//create the result
	//If result==true then test case failed
	//If result==false then test case passed
	soft.assertFalse(result, "Homepage URL is not found");
	
	//forcefully failed the test method
	soft.fail();
	
	
	//to apply the result of soft assert on test methods.
	soft.assertAll();
	}
	@Test
	public void  testB()
	{
		System.out.println("TestB-TestClass2"); 
		
		String actualUrl="https://www.facebook.com/";
		String expectedURl ="https://www.facebook.com/home";
	
		String actualTitle="Log in";
		String expectedTitle ="Log in page";
		
		String actualName="Cancel";
		String expectedName ="Cancel123";
	
	   SoftAssert soft=new SoftAssert();
	   soft.assertEquals(actualUrl, expectedURl,"Homepage URL is not found");
	   soft.assertEquals(actualUrl, expectedURl,"Homepage Title is wrong");
	   soft.assertEquals(actualUrl, expectedURl,"Homepage URL is not found");
	   soft.assertAll();
	}
}
