package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSetSize {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeAsyncScript("window.scrollBy(0 ,900)");
		js.executeScript("window.scrollBy(0 ,900)");
		Thread.sleep(2000);
		

	}

}
