import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\1SEL\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); //Common methods/functions
	//TakeScreenshot
	TakesScreenshot screen=(TakesScreenshot)driver;
	driver.get("http://google.com");;
	File src=screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(".\\google.jpg"));
	driver.quit();
}
}
