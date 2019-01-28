package Hello;


import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Grid {
	WebDriver driver;

	@BeforeTest
	@Parameters({ "node", "browser" })

	public void beforeTest(String node, String browser) throws Exception {
		DesiredCapabilities dc = null;
		if (browser.equalsIgnoreCase("chrome")) {
			dc = DesiredCapabilities.chrome();

		} else if (browser.equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
		}
		dc.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(node), dc);
	}

	@Test
	public void FirstTest() throws Exception {

		System.out.println("Starting Browser");
		driver.get("http://google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@AfterTest
	public void AfterTest() {
		driver.quit();
	}

}
