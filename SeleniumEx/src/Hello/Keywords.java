package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Keywords 
{
WebDriver driver;
Keywords(WebDriver driver){
	this.driver=driver;
	
}
public void type(String elementprop,String data)
{
	String element=elementprop.split(":")[0];
	if(elementprop.endsWith("name"))
	   {
		   driver.findElement(By.name(element)).clear();
		   driver.findElement(By.name(element)).sendKeys(data+Keys.ENTER);
	   }
	else if(elementprop.endsWith("css"))
	   {
		   driver.findElement(By.cssSelector(element)).clear();
		   driver.findElement(By.cssSelector(element)).sendKeys(data+Keys.ENTER);
	   }
	else if(elementprop.endsWith("id"))
	   {
		   driver.findElement(By.id(element)).clear();
		   driver.findElement(By.id(element)).sendKeys(data+Keys.ENTER);
	   }
	else if(elementprop.endsWith("type"))
	   {
		   driver.findElement(By.cssSelector(element)).clear();
		   driver.findElement(By.cssSelector(element)).sendKeys(data+Keys.ENTER);
	   }
	else if(elementprop.endsWith("xpath"))
	   {
		   driver.findElement(By.xpath(element)).clear();
		   driver.findElement(By.xpath(element)).sendKeys(data+Keys.ENTER);
	   }
	/*public void click(String elementprop)
	{
		String element=elementprop.spli
	}*/
}
}
