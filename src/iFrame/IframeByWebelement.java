package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeByWebelement {

	public static void main(String[] args)
	{
		    System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			//first find iframe
			//store in webelement
			
			WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
			driver.switchTo().frame(iframeElement);
			driver.findElement(By.linkText("org.openqa.selenium")).click();
			//now switch to main frame we can not go dirctly from one frame to anather frame
			//switch main page
			driver.switchTo().defaultContent();
			
			//switch to 2nd frame
			driver.switchTo().frame(1);
			driver.findElement(By.linkText("Alert")).click();
			
			//find and print total no of iframes
			
			driver.switchTo().defaultContent();
			
	        // iframesTotalNo = driver.findElement(By.tagName("iframe")).size();
			
	}

}
