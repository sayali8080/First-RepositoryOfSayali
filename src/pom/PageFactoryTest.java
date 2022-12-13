package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryTest
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
		//create object of  PomPageFactory
		
		 PomPageFactory pp=new PomPageFactory(driver);
		pp.enterUserName();
		 pp.enterPassword();
		 pp.clickLogin(driver);
		 pp.enterUserName();

	}

}
