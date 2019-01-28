import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:3726833834910578721::NO:::");
		WebElement webElement=driver.findElement(By.name("p_t01"));
		webElement.clear();
		boolean isDisplayed= webElement.isDisplayed();
		boolean isEnabled= webElement.isEnabled();
		String size=webElement.getAttribute("size");
		System.out.println(isDisplayed);
		System.out.println(isEnabled);
		System.out.println(size);
		if(isDisplayed==true && isEnabled==true && size.equals("30"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		WebElement webElement1=driver.findElement(By.name("p_t02"));
		webElement1.clear();
		boolean isDisplayed1= webElement1.isDisplayed();
		boolean isEnabled1= webElement1.isEnabled();
		String size1=webElement1.getAttribute("size");
		if(isDisplayed1==true && isEnabled1==true && size1.equals("30"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
