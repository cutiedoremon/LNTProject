package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Hello.BaseDAO;

public class Base extends BaseDAO {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
{
			System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		    driver=new ChromeDriver();
}
		else if(browser.equalsIgnoreCase("firefox"))
		{
					System.setProperty("webdriver.gecko.driver", "C:\\1SEL\\geckodriver.exe");
				   driver=new FirefoxDriver();
		}
 
}}
