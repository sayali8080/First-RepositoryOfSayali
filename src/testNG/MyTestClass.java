package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void metho1()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
	  
	   WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	  
  }
  @Test
  public void method2()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
	  
	   WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	  
  }
}
