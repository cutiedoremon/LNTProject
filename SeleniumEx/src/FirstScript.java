import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FirstScript {
  public static void main(String args[])
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	 // driver.findElement(By.("Download")).click();
	 // String title=driver.getTitle();
	 // System.out.println("You are on "+title+" page");
	  //driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("PamaPamaAnupama"+Keys.ENTER);
	//  driver.quit();
	  Actions a=new Actions(driver);
	 WebElement E=driver.findElement(By.name("q"));
	 Action ac=a.keyUp(Keys.SHIFT).sendKeys(E,"PAMA PAMA ANUPAMA").doubleClick(E).contextClick(E).build();
	 ac.perform();	  
  }
}
