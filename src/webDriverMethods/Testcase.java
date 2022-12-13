package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in");
		
		Thread.sleep(1000);
		
		//System.out.println(driver.getTitle());
		
		String expectedTitle=("Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket &");
		
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Testcase Pass");
		}
		else
		{
			System.out.println("Testcase Fail");
		}
	}

}
