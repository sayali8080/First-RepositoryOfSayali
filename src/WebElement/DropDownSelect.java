package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		Thread.sleep(1000);
		//***********for day**************
		
		
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		
		Select sday=new Select(day);
		sday.selectByIndex(0);
		Thread.sleep(1000);
		
		//***********for month**************
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		
		Select smonth=new Select(month);
		smonth.selectByIndex(2);
		Thread.sleep(1000);
		
		
		//***********for year********************
		
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		
		Select syear=new Select(year);
		syear.selectByValue("1996");
		Thread.sleep(1000);
		
		
		
	}

}
