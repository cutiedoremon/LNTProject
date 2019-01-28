package Hello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertExample extends Base {
  @Test
  public void TestAlert() throws Exception 
  {
	  driver.get("https://www.magneticautomation.in/2019/01/alert-example.html?m=1");
	  
	  driver.findElement(By.xpath("//button[@onclick='myFunction1()']")).click();
	  Alert al=driver.switchTo().alert();
	  System.out.println(al.getText());
	  Thread.sleep(5000);
	  al.accept();
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  System.out.println(al.getText());
	  al.sendKeys("Pama Pama Anupama");
	  al.accept();
	  Thread.sleep(5000);
  }
 
}
