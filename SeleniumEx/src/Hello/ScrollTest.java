package Hello;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollTest extends Base {
  @Test
  public void Scroll() throws InterruptedException 
  {
	  JavascriptExecutor e=(JavascriptExecutor)driver;
	  driver.get("https://www.seleniumhq.org/");
	  e.executeScript("window.scrollBy(0,200)"); 
	  Thread.sleep(7000);
	//  e.executeScript("window.scrollBy(0,-200)");
	 // Thread.sleep(7000);
	
	  //e.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  //Thread.sleep(7000);
	
		 e.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[contains(text(),'full list of sponsors')]")));
		 Thread.sleep(7000);
		 //e.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[contains(text(),'Selenium blog')]")));
		// Thread.sleep(7000);
	  e.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[contains(text(),'full list of sponsors')]")));
	  Thread.sleep(7000);
	  
	  
  }
}
