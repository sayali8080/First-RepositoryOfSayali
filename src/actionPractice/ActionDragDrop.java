package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragDrop {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 Actions act=new Actions(driver);
		
		WebElement source = driver.findElement(By.linkText("5000"));
		WebElement destination = driver.findElement(By.id("shoppingCart4"));
	
		//act.moveToElement(source).clickAndHold().release(destination).build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
		

	}

}
