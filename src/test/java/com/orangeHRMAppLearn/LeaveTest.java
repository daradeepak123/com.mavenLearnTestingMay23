package com.orangeHRMAppLearn;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeaveTest extends BaseClass{
	
	@BeforeMethod
	public void dashBoard()
	{
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
	}
	
	@Test(priority = 1)
	public void leave()
	{
		System.out.println(driver.findElement(By.xpath("//h6[text()='Leave']")).getText());
	}

}
