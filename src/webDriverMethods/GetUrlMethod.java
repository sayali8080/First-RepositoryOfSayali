package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlMethod {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());//just printing in console
		
	//*********need to store 
		String mystr=driver.getCurrentUrl();
		
		System.out.println("URL is "+mystr);

	}

}
