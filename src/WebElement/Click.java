package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
	    driver.findElement(By.xpath("//input[@value='option3']")).click();
	    driver.findElement(By.xpath("//input[@value='option1']")).click();
	
		
		
		
	}

}
