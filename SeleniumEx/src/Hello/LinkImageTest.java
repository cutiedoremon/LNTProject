package Hello;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkImageTest extends Base 
{
  @Test
  public void LinkTest() 
  {
	  driver.get("https://www.google.com/");
	  List<WebElement> AllLinkImage=driver.findElements(By.xpath("//a"));
	  AllLinkImage.addAll(driver.findElements(By.tagName("img")));
	  
	  for(WebElement E:AllLinkImage)
	  {
		  String url=E.getAttribute("href");
		  try
		  {
			  URL u=new URL(url);
			  URLConnection con=u.openConnection(); //opens Port for Connection
			 HttpURLConnection HUC=(HttpURLConnection)con;
			 HUC.connect();
			 
			 int code=HUC.getResponseCode();
			 
			 if(code==200)
			 {
				 System.out.println(url+"---------Working with status------------------" +code);
			 }
			 else
			 {
				 System.out.println(url+"-------------Not working with status----------------" +code);
			 }
		  }
		  catch (Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
	  }
  }
}
