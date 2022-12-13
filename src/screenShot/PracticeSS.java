package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class PracticeSS {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		TakesScreenshot scrnsht = ((TakesScreenshot)driver);
		
		File source = scrnsht.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		String str = RandomString.make(5);
		
		File destination=new File("G:\\Selenium\\screenshots\\another.png"+str+".png");
		
	    FileHandler.copy(source, destination);
		

	}

}
