package testNG;

import org.testng.annotations.Test;

public class AnnotationAttribute 
{
	//TimeOut-->we can add specific time for TC
 // @Test(description="This is testcase One")
	//@Test(priority=1)
	@Test(dependsOnMethods= {"testcase2"})
	 public void testcase1()
  {
	  System.out.println("Mobile log in TestCase1");
  }
  
 // @Test(description="This is testcase Two")
//  @Test(timeOut=200)
	@Test
  public void testcase2()
  {
	  
	  System.out.println("Web log in TestCase2");
  }
  
//  @Test(description="This is testcase Three")
//	@Test(priority=3)
	@Test
  public void testcase3()
  {
	  System.out.println("APi log in TestCase3");
  }
}
