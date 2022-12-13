package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SectionSS {

	public static void main(String[] args) throws IOException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement section = driver.findElement(By.xpath("//input[@id='email']"));
		
        File source = section.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("G:\\Selenium\\screenshots\\section.png");
		
		FileHandler.copy(source, dest);

	}

}
