package upStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserValidarionByExcelDynamicly
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File myFile=new File("G:\\Selenium\\PracticeExcelSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String un = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		String pwd = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		
		WebElement userName = driver.findElement(By.name("userId"));
		userName.sendKeys(un);
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(pwd);
		
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		
		Thread.sleep(4000);
		
		WebElement birthYear = driver.findElement(By.id("yob"));
		birthYear.sendKeys(mySheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(50000);

	}

}
