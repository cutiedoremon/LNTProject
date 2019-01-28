import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("http://192.168.100.221/abc.html");
		WebElement frameElement=driver.findElement(By.xpath("/html/body/iframe[2]"));
		driver.switchTo().frame(frameElement);
		 driver.findElement(By.name("userName")).sendKeys("123");
		 driver.findElement(By.name("password")).sendKeys("123");
		 driver.switchTo().defaultContent();
		 String ParentID=driver.getWindowHandle();
		driver.findElement(By.linkText("Google")).click();
		Set<String> allWin=driver.getWindowHandles();
		for(String ID:allWin)
		{
			if(!ID.equals(ParentID))
			{
				driver.switchTo().window(ID);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentID);
		driver.close();

	}

}
