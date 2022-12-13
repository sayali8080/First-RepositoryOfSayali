package commonlyUseMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods
{
	//Screenshot Method
   public static void takesScreenshots(WebDriver driver, String name) throws IOException
   {
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("G:\\Selenium\\screenshots\\"+name+".png");
	   
	   FileHandler.copy(src, dest);
   
   }
}