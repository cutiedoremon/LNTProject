import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {
private static Scanner sc;

public static void main(String[] args)
{
	sc = new Scanner(System.in);
	System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.blazedemo.com/");
	//  Select select=new Select(driver.findElement(By.name("fromPort")));
	
	
	//  select.selectByVisibleText("Boston");
	 // select.selectByIndex(6);
	// select.selectByValue("Portland");
	 // List <WebElement> alloption=select.getOptions();
	/*for(int i=0;i<alloption.size();i++)
	 {
	  System.out.println(alloption.get(i).getText());
	  }
	  for(WebElement A:alloption) {
		  System.out.println(A.getText());
	  }
	  System.out.println("Short Method");
	  System.out.println(driver.findElement(By.name("fromPort")).getText());
	  
	  Select select1=new Select(driver.findElement(By.name("toPort")));
	  select.selectByVisibleText("Portland");
	  
	  List <WebElement> alloption1=select.getOptions();
		for(int i=0;i<alloption1.size();i++)
		 {
		  System.out.println(alloption1.get(i).getText());
		  }
		
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Cairo");
		*/
		driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
		
				List<WebElement> allelement=driver.findElements(By.cssSelector("input[value='Choose This Flight']"));
				for(int i=0;i<allelement.size();i++)
				 {
				  System.out.println(allelement.get(i).getText());
				  }
				allelement.get(2).click();
				System.out.println("Total Flights are" +allelement.size());
			String name=sc.nextLine();
			driver.findElement(By.id("inputName")).sendKeys(name);
			driver.findElement(By.id("address")).sendKeys("6 LTI");
			driver.findElement(By.id("city")).sendKeys("Mumbai");
			driver.findElement(By.id("state")).sendKeys("Maharashtra");
			driver.findElement(By.id("zipCode")).sendKeys("421202");
			
			Select select=new Select(driver.findElement(By.name("cardType")));
			List<WebElement> allelements=driver.findElements(By.name("cardType"));
			System.out.println(driver.findElement(By.name("cardType")).getText());
			new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
		//	allelements.get(1).click();
			driver.findElement(By.id("creditCardNumber")).sendKeys("1523256745");
		    driver.findElement(By.id("nameOnCard")).sendKeys("Anupama");
		    driver.findElement(By.id("rememberMe")).click();
		    driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
}
}
