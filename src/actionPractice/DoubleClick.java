package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick
{

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Mouse Action Double CLick
		//Need to create action class and pass driver object as a argument
		 Actions act=new Actions(driver);
		 
		 WebElement doubleclickme = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 
		// act.moveToElement(double-click-me).perform();
		 
		// act.doubleClick().perform();
		 
		 act.moveToElement(doubleclickme).doubleClick().build().perform();
		 
		 
		 

		
		 
		 
	}

}
