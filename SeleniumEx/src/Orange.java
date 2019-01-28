import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Orange {
public static void main(String args[]) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Actions actions=new Actions(driver);
	//WebDriverWait explicitwait=new WebDriverWait(driver,100); //explicit
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //implicit
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 //driver.findElement(By.id("welcome")).click();
	 //explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))); //explicit
	//  Thread.sleep(2000);
	 // driver.findElement(By.linkText("Logout")).click();
	// driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();
	  
	  WebElement E=driver.findElement(By.linkText("PIM"));
	  actions.moveToElement(E).perform();
	  actions.click(driver.findElement(By.linkText("Add Employee"))).perform();
	  
}
}





//explicit advantages over implicit alert, visibility, invisibility
//1.have multiple conditions
//2.keep global as less as possible as it can take long execution time
