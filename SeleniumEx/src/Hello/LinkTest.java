package Hello;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkTest extends Base{
	
  @Test
  public void f() throws Exception {
	  int i=0;
	  driver.get("http://www.newtours.demoaut.com/");
	  List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
	  for (int j=0;j<allLinks.size();j++) {
		  allLinks =  driver.findElements(By.tagName("a"));
		  allLinks.get(j).click();
          if(driver.getTitle().startsWith("Under Construction:"))
          {
        	  System.out.println("Link under construction");
        	  i++;
          }
          else
          {
        	  System.out.println("Link is working");
          }
		 driver.findElement(By.linkText("Home")).click();
		
	  }
  }}
  

