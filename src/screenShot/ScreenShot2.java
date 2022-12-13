package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException
	{
       System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		//Step 1: Convert WebDriver object to TakesScreenshot interface
		TakesScreenshot srnshot=((TakesScreenshot)driver);
		
		//Step 2: Call getScreenshotAs method to create image file by using object of TakesScreenshot interface 
		//it will return file and store it into file class object
		File source = srnshot.getScreenshotAs(OutputType.FILE);
		
		//
		File dest=new File("G:\\Selenium\\screenshots\\demo2.png");
		
		//Step 3: copy image file to destination
		FileHandler.copy(source, dest);
		
	}

}
