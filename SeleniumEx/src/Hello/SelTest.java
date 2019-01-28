package Hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SelTest extends Base{
  @Test
  public void f() throws Exception {
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
	  String[] username=new String[2];
	  String[] password=new String[2];
	  ArrayList<String> show=new ArrayList<String>();
	  try {
	  Statement st=conn.createStatement();
	  ResultSet result=st.executeQuery("select * from Sel");
	  System.out.println(result);
	  
	  while(result.next())
	  {
		  for(int i=0;i<show.size();i++)
		  {
			  username[i]=result.getString(1);
			  System.out.println(username[i]);
			  password[i]=result.getString(2);
			  driver.findElement(By.name("p_t01")).clear();
			  driver.findElement(By.name("p_t01")).sendKeys( username[i]);
			  driver.findElement(By.name("p_t02")).clear();
			  driver.findElement(By.name("p_t02")).sendKeys(password[i]);
			  Thread.sleep(5000);
				 Assert.assertEquals(driver.getTitle(), "Oracle", "Login Fail");
		  }
	  } 
	 result.close();
	 st.close();
	  }catch (SQLException e) {
	   e.printStackTrace();
	  }
	 }
  }

