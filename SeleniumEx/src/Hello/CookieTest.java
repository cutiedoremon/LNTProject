package Hello;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CookieTest {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\1SEL\\\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
		  driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys("sys");
		  driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys("Newuser123"+Keys.ENTER);
		  assertEquals("Oracle",driver.getTitle(), "Login Fail");
		  
		Set<Cookie> allCookie=driver.manage().getCookies();
		for(Cookie c:allCookie)
		{
			System.out.println("Name"+c.getName());
			System.out.println("Domain"+c.getDomain());
			System.out.println("Path"+c.getPath());
			System.out.println("Value"+c.getValue());
			System.out.println("Class"+c.getClass());
			System.out.println("Expiry"+c.getExpiry());
		}
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("SQL")).click();
		 assertEquals("SQL",driver.getTitle(), "Cookie Deleted");
		
		
	}

}
