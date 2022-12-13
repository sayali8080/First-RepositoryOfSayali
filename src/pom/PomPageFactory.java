package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonlyUseMethods.CommonlyUsedMethods;

public class PomPageFactory
{
	
	//Data member should be declared globally with access level private using @findBy Annotation
	
       @FindBy(id="user-name") WebElement userId;
       @FindBy(id="password")WebElement password;
       @FindBy(id="login-button")WebElement login;
       
     //2. Initialize within a constructor with access level public using pagefactory
       
       public PomPageFactory(WebDriver driver)
       {
    	   PageFactory.initElements(driver,this);
       }
       
     //3.Utilize within a method with access level public
       
       public void enterUserName()
       {
    	  // CommonlyUsedMethods.takesScreenshots(driver, "New1");
    	   userId.sendKeys("standard_user");
       }
       public void enterPassword() 
       {
    	  
    	   password.sendKeys("secret_sauce");
       }
       public void clickLogin(WebDriver driver) throws IOException
       {
    	   login.click();
    	   CommonlyUsedMethods.takesScreenshots(driver, "New1");
    	   
       }

	public void enterUserName1(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
	}
       

}
