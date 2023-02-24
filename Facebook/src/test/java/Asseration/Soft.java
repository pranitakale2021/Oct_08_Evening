package Asseration;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	@Test
	public void m1()
	{
		SoftAssert soft=new SoftAssert();
		String a="coding with mk";
		String b="coding with mk";
		
		soft.assertEquals(a, b);
		System.out.println("First soft assert is pass");
		
		String c="coding with mk";
		String d="coding with mk in class";
		
		soft.assertEquals(c, d);
		System.out.println("First soft assert is pass");
		
		String e="coding with mk";
		String f="coding with mk";
		
		soft.assertEquals(e, f);
		System.out.println("First soft assert is pass");
		
		soft.assertAll();
	}
}
		
		


