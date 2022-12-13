package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com/");
		
		System.out.println(driver.getTitle());//just printing in console
		
	//*********need to store 
		String mystr=driver.getTitle();
		
		System.out.println("Title is "+mystr);
		
		
		
	}

}
