package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		//We perform here,Mouse Action so ,move to element
		
		//1.Step
		//Create object of action class and pass the driver object as an argument
		
	    Actions act=new Actions(driver);
	    
	    Thread.sleep(3000);
	      
	    //2.Step
	    //using one of the method and perform required actions
	    
	    WebElement e1 = driver.findElement(By.linkText("BANK"));
	    
	    act.moveToElement(e1).perform();
	    Thread.sleep(3000);
	    
	   WebElement clickme = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
	    
	  // act.moveToElement(clickme).perform();
	   Thread.sleep(3000);
	  // act.click().perform();
	   
	   act.moveToElement(clickme).click().build().perform();//we can use multiple methods in single line
	   
	   
	      
	}

}
