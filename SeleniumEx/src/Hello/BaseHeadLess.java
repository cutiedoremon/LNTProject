import org.testng.annotations.Test;

import Hello.Keywords;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BaseHeadLess {
public static WebDriver driver;
public Properties prop;
public Keywords keywordsObj;


@BeforeTest
public void beforeTest() throws FileNotFoundException, IOException 
{
prop = new Properties();
prop.load(new FileInputStream(".\\constantss.property"));

//System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.exe");
 driver = new HtmlUnitDriver(true);
keywordsObj = new Keywords(driver); 

}

@AfterTest
public void afterTest() 
{
driver.quit();
}

}
