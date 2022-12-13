package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass {
  @Test//TC-->method
  public void A() 
  {
	  System.out.println("Hi A TC is running");
	  
	  Reporter.log("Hi A TC is running--> using log");
	  
	  Reporter.log("Hi A TC is running--> using log", true);
  }
}
