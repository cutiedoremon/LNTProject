package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM 
{
	WebDriver driver;
	LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.name("p_t01");
	By password=By.name("p_t02");
	By loginButton=By.cssSelector("input[value='Login']");
	By startedButton=By.cssSelector("input[value='GettingStarted']");
	
	
	public void LoginProcess(String Username,String Password)
	{
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginButton).click();
	}
}
