package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.discoveryplus.in/?gclid=CjwKCAjw4c-ZBhAEEiwAZ105Re4NLMW2qAHizqv36jt7YQxjpq7FOVAQ4KODOdVqEVqwXfHhmHVWSBoCQsUQAvD_BwE");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement getOtpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		Thread.sleep(2000);
		
		System.out.println(getOtpbutton.isEnabled());
		Thread.sleep(2000);
		
		getOtpbutton.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9876554567");
		Thread.sleep(2000);
		
		System.out.println(getOtpbutton.isEnabled());
		Thread.sleep(2000);
		
	}

}
