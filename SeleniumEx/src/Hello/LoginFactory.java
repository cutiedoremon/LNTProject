package Hello;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginFactory {
	WebDriver driver;
  public LoginFactory(WebDriver driver) 
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  @FindBy(name="p_t01") WebElement username;
  @FindBy(name="p_t02") WebElement password;
  @FindBy(css="input[value='Login']") WebElement login;

 //@CacheLookup
 @FindBy(xpath="//a")  List<WebElement> links;
 public void LoginProcess(String userName, String Password)

 {
	 username.sendKeys(userName);
	 password.sendKeys(Password);
	 login.click();
	 
 }
 
 public void LinkTest()
 {
	 driver.get("http://www.newtours.demoaut.com/");
	 for(int i=0;i<links.size();i++)
	 {
		 System.out.println(links.get(i).getText());
		 links.get(i).click();
		 
		 try
		 {
			 Thread.sleep(2000);
		 }catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 if(driver.getTitle().startsWith("Under Construction:"))
         {
       	  System.out.println("Link under construction");
       	  i++;
         }
         else
         {
       	  System.out.println("Link is working");
         }
		 driver.navigate().back();
	 }
 }
 }

