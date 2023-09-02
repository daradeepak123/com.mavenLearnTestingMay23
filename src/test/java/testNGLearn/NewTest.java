package testNGLearn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testMethod() {
	  System.out.println("THis is actual test");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("THis is actual test1111111111111");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("THis is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is befoere suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
