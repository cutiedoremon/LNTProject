package Hello;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyConfig
{
	static Select s;
	static WebDriver w;
	public static void openBrowser(String Location)
	{
		if(Location.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",Location);
		w=new ChromeDriver();
		}
		else if(Location.contains("gecko"))
		{
		System.setProperty("webdriver.gecko.driver",Location);
		w=new FirefoxDriver();
		}
	}
	
	public static void openUrl(String URL)
	{
		w.get(URL);
	}
	
	public static void enterText(String Locator,String LocatorValue,String inputdata)
	{
		switch(Locator)
		{
		case "name":
			w.findElement(By.name(LocatorValue)).sendKeys(inputdata);
			break;
		case "id":
			w.findElement(By.id(LocatorValue)).sendKeys(inputdata);
			break;
		case "css":
			w.findElement(By.cssSelector(LocatorValue)).sendKeys(inputdata);
			break;
		case "link":
			w.findElement(By.linkText(LocatorValue)).sendKeys(inputdata);
			break;
		case "xpath":
			w.findElement(By.xpath(LocatorValue)).sendKeys(inputdata);
			break;
		default:
			System.out.println("Invalid Locator Specified");
		}
	}
	public static void pickDate(String Locator,String LocatorValue1,String LocatorValue2)
	{
		switch(Locator)
		{
		case "name":
			w.findElement(By.name(LocatorValue1)).click();;
			break;
		case "id":
			w.findElement(By.id(LocatorValue1)).click();;
			break;
		case "css":
			w.findElement(By.cssSelector(LocatorValue1)).click();;
			break;
		case "link":
			w.findElement(By.linkText(LocatorValue1)).click();;
			break;
		case "xpath":
			if (w.findElement(By.xpath(LocatorValue1)).isDisplayed() == true && w.findElement(By.xpath(LocatorValue2)).isDisplayed() ) {
			  w.findElement(By.xpath("//td[@class=' undefined']/a[text()='23']")).click();
			}
			else
				w.findElement(By.cssSelector("a.nextMonth"));
			break;
		default:
			System.out.println("Invalid Locator Specified");	
		}
	}
	public static void click(String Locator,String LocatorValue)
	{
		switch(Locator)
		{
		case "name":
			w.findElement(By.name(LocatorValue)).click();;
			break;
		case "id":
			w.findElement(By.id(LocatorValue)).click();;
			break;
		case "css":
			w.findElement(By.cssSelector(LocatorValue)).click();;
			break;
		case "link":
			w.findElement(By.linkText(LocatorValue)).click();;
			break;
		case "xpath":
			w.findElement(By.xpath(LocatorValue)).click();;
			break;
		default:
			System.out.println("Invalid Locator Specified");	
		}}

	public static void dropdownSelect(String Locator, String LocatorValue, String inputdata) {
		// TODO Auto-generated method stub
		switch(Locator)
		{
		case "name":
			 s= new Select(w.findElement(By.name(LocatorValue)));
			 s.selectByVisibleText(inputdata);
			break;
		case "id":
			 s= new Select(w.findElement(By.id(LocatorValue)));
			 s.selectByVisibleText(inputdata);
			break;
		case "css":
			s= new Select(w.findElement(By.cssSelector(LocatorValue)));
			 s.selectByVisibleText(inputdata);
			break;
		case "link":
			s= new Select(w.findElement(By.linkText(LocatorValue)));
			 s.selectByVisibleText(inputdata);
			break;
		case "xpath":
			s= new Select(w.findElement(By.xpath(LocatorValue)));
			 s.selectByVisibleText(inputdata);
			break;
		default:
			System.out.println("Invalid Locator Specified");	
		}}
	}

	
 


