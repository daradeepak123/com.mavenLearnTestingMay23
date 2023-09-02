package com.orangeHRMAppLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

	public static WebDriver driver;


		
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("THis is before suite");
	}

	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}

	@BeforeClass
	public void loginapp()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		String header=driver.findElement(By.xpath("//h6")).getText();
		Assert.assertEquals(header, "Dashboard");
		
	}
	
	
	
	
	

	@AfterClass
	public void logOutapp()
	{
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

	@AfterTest
	public void closeDriver()
	{
		driver.quit();
	}

	@AfterSuite
	public void closePostDocuments()
	{
		System.out.println("THis is after suite");
	}




}
