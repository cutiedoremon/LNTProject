package Hello;
import java.io.FileInputStream;
/*import java.io.FileNotFoundException;
import java.io.IOException;*/
import java.util.Properties;

/*import org.openqa.selenium.By;
import org.openqa.selenium.Keys;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base extends BaseDAO{
    protected static WebDriver driver;
	Properties prop;
	public Keywords key;
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser) throws Exception {
		
		 prop=new Properties();
		 prop.load(new FileInputStream("D:\\Book Shopping\\SeleniumEx\\src\\Hello\\constantss.property"));
		 
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
   key=new Keywords(driver);
}

}
