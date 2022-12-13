package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sayali");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("patil@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Anshula@gmail.com");
		
		Thread.sleep(1000);
		
		//Now will store in variable
		
		WebElement emailIdField = driver.findElement(By.xpath("//input[@id='email']"));
		
		emailIdField.clear();
		emailIdField.sendKeys("advik@gmail.com");
		
		
		
		
		
	}

}
