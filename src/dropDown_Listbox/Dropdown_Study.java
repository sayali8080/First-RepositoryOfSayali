package dropDown_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Study {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		
		Select sdropDown=new Select(dropDown);
		
		sdropDown.selectByValue("option3");
		

	}

}
