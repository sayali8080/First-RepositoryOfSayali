package iFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2byNAme {

	public static void main(String[] args)
	{
		    System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			//switch by using name
			
			driver.switchTo().frame("packageListFrame");
			
			
			
	}

}
