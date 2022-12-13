package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextCLick {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Mouse Action Context Click means Right click
		//Need to create action class and pass driver object as a argument
		
		Actions act = new Actions(driver);
		
		WebElement rightclickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.moveToElement(rightclickMe).perform();
		
		act.contextClick().perform();

	}

}
