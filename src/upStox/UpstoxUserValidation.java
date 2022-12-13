package upStox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxUserValidation {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("userId")).sendKeys("6WBG4X");
		driver.findElement(By.name("password")).sendKeys("KKdbFI@4WY");
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("yob")).sendKeys("1996");
		Thread.sleep(50000);
		
	    driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
        Thread.sleep(10000);
        
       /*	 String actualUserName = driver.findElement(By.xpath("(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div[1]//div[2]")).getText();
        System.out.println(actualUserName);
      
        String expectedUserName = "Sayali P.";
        
        if(actualUserName.equals(expectedUserName))
        {
        	System.out.println("TestCase is Passed");
        }
        else
        {
        	System.out.println("TestCase is Failed");
        }*/
        
        System.out.println("===============================================================================");
        
        //Check Fund
        driver.findElement(By.id("funds")).click();
        Thread.sleep(50000);
        
        
        String totalFund = driver.findElement(By.xpath("(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div[1]//div[2]")).getText();
        System.out.println(totalFund);
      
	
	}
}
