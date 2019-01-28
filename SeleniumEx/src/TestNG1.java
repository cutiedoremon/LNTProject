import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG1 extends Base
{
WebDriver driver;

  @Test
  public void TitleTest()
  {
	  driver.get("http://google.com");
	  Assert.assertEquals(driver.getTitle(), "Google");
  }
  @Test(dependsOnMethods="TitleTest")
  public void SearchTest()
  {
	  WebElement E=driver.findElement(By.name("q"));
	   Assert.assertEquals(E.isDisplayed(), true);
	   Assert.assertEquals(E.isEnabled(), true);
	   Assert.assertEquals(E.getAttribute("type"), "txt" , "pama pama anupama");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  


}
