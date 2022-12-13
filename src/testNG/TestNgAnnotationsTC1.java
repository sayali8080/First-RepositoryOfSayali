package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationsTC1 
{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before-Test....////n");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is Afterrrr-Test....////n");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before-CLass..../n");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is After-CLass..../n");
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is Before-Method");
	}
	
	@AfterMethod
	public void aftermethgod()
	{
		System.out.println("This is After-Method");
	}
		
  @Test
  public void test1()
  {
	  System.out.println("This is test1........");
  }
  
  @Test
  public void test2()
  {
	  System.out.println("This is test2........");
  }
  @Test
  public void test3()
  {
	  System.out.println("This is test3........");
  }
}
