package actionPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionKeyboard 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));

		//username.sendKeys("Hello");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(username).sendKeys("SAyali here").build().perform();
		
		Thread.sleep(2000);
		
		
		WebElement CreateAcct = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Thread.sleep(2000);
		
		act.click(CreateAcct).perform();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		
		act.click(day).perform();
		
		//How to handle drop-down
		
		//act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(3000);
		
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(500);
		//act.sendKeys(Keys.ARROW_UP).perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
		for(int i=1;i<= 10;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		//*******************Capital letters****************
		
		WebElement name = driver.findElement(By.name("firstname"));
		
		act.keyDown(name, Keys.SHIFT).sendKeys("anshula").build().perform();
		
		}

}
