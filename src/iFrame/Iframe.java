package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args)
	
	{
System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//switch to I-frame by id,,,,,,,,,,,,(we can switch by name,value and index)
		driver.switchTo().frame("moneyiframe");
		
		//find webElemen and print value
		String obj = driver.findElement(By.id("nseindex")).getText();
		System.out.println(obj);
		
		

	}

}
