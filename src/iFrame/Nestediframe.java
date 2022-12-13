package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");//parent frame or outer frame
		
		driver.switchTo().frame("frame3");//child or inner frame'
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//b[contains(text(),'Inner Frame Check')]")).click();
		
		driver.findElement(By.id("a")).click();

		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.tagName("input")).sendKeys("this is sayali");
		

		//for switching frame 1 to frame 2 need to first switch on main frame
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement DropdownElement = driver.findElement(By.id("animals"));
		
		Select dropdown=new Select(DropdownElement);
		
		dropdown.selectByVisibleText("Big Baby Cat");
		
		
		
		
		
		
		
		
	}
	
	
	
}

