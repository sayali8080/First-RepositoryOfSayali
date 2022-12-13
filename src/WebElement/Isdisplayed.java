package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		//textBox.sendKeys("Welcome");
		
	    WebElement hideBox = driver.findElement(By.id("hide-textbox"));
	    
	    hideBox.click();
	    
	    WebElement showBox = driver.findElement(By.id("show-textbox"));
	    
	    showBox.click();
	    
	    
	    if(textBox.isDisplayed())
	    {
	    	textBox.sendKeys("good morning india");	
	    }
	    else
	    {
	    	System.out.println("textbox is not display");
	    }

	}

}
