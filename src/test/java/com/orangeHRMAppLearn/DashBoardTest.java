												package com.orangeHRMAppLearn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DashBoardTest extends BaseClass{
	
	@BeforeMethod
	public void dashBoard()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}
	
	@Test(priority = 1)
	public void dashboard()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button")).click();
	}
	
	@Test (priority = 2)
	public void dashboardTimeWork()
	{
		String s=driver.findElement(By.xpath("//p[text()='Time at Work']")).getText();		
		Assert.assertEquals(s, "Time at Work");
		System.out.println("Check the assert");
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(s, "Time at Worksss");
		
		System.out.println("Check the assert  SA");
		sa.assertAll();
		
	}

}
