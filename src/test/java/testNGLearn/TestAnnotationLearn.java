package testNGLearn;

import org.testng.annotations.Test;

public class TestAnnotationLearn {
	
	@Test(priority = 1,description = "this test is to perform calculator test on home page")
	public void zztest()
	{
		System.out.println("This is TestMethod zzzz");
	}
	
	
	
	@Test (priority = 2)
	public void test()
	{
		System.out.println("This is TestMethod");
	}
	

	@Test(invocationCount = 5,enabled = true,priority=4)
	public void test1()
	{
		System.out.println("This is test method2");
	}
	
	@Test(priority = 3)
	public void aatest()
	{
		System.out.println("This is TestMethod aaaa");
	}

}
