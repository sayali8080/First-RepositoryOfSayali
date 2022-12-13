	
package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//find 3rd cell in web table and print third cell data
		
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		System.out.println(text);
		
		//find total no of column
		
		List<WebElement> totalColumn = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		
		System.out.println("colums: "+ totalColumn.size());
		
		//find total no of row
		
		List<WebElement> totalRow = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Row: "+ totalRow.size());
		
		//find all cell table data from webtable
		//need two for loop---->1st for loop Row and 2nd for loop column
		
		for(int r=2;r<=totalRow.size();r++)
		{
			for(int c=1;c<=totalColumn.size();c++)
			{
				String allData = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"]")).getText();
				
				System.out.println(allData);
			}
		}
		
		
		

	
		
	}

}
