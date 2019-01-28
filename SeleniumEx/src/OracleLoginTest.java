import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleLoginTest {
	 private static Scanner sc;

	public static void main(String args[])
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  sc = new Scanner(System.in);
		  System.out.println("ENter Username");
		  String username=sc.nextLine();
		  System.out.println("ENter password");
		  String password=sc.nextLine();
		  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
		  String HomePagetitle=driver.getTitle();
		  driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys(username);
		  driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys(password);
		  driver.findElement(By.cssSelector("input[type='BUTTON']")).click();
		  String Logintitle=driver.getTitle();
		  if(HomePagetitle.equals(Logintitle))
		  {
			  System.out.println("Login Failed");
		  }
		  else {
			  System.out.println("Login Successful");
		  }
	 }
}
