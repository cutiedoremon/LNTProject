import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("https://www.amazon.in/");
		 WebElement E=driver.findElement(By.cssSelector("a[href='/gp/site-directory?ref=nav_shopall_btn']"));
		 actions.moveToElement(E).perform();
		 WebElement M=driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span"));
		 actions.moveToElement(M).perform();
		//driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[2]/div/a[1]/span[1]")).click();
	   actions.click(driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[2]/div/a[1]/span[1]"))).perform();
	}
}
