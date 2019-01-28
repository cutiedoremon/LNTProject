package Hello;
import org.testng.annotations.Test;
/*import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;*/
import org.testng.annotations.DataProvider;
/*import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;*/
import java.sql.ResultSet;
import java.sql.Statement;
/*import java.util.Properties;

import org.apache.commons.io.FileUtils;*/
import org.openqa.selenium.By;
/*import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;*/
import org.testng.Assert;
/*import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;*/

public class FetchTest extends Base {
	 @Test(dataProvider = "dp")
 // @Test
  public void f(String n,String s) throws Exception {
  //public void f() throws Exception {
	  driver.get(prop.getProperty("url"));
	  key.type(prop.getProperty("e_un"),n);
	  key.type(prop.getProperty("e_p"),s);
	  
	  /*driver.findElement(By.name("p_t01")).clear();
	  driver.findElement(By.name("p_t01")).sendKeys(n);
	  driver.findElement(By.name("p_t02")).clear();
	  driver.findElement(By.name("p_t02")).sendKeys(s);*/
	  
	  Thread.sleep(5000);
	 Assert.assertEquals(driver.getTitle(), "Oracle", "Login Fail");
	  driver.findElement(By.linkText("Logout")).click();
  }
  /*@BeforeMethod
  public void beforeMethod() {
  }
*/
  
 
  @DataProvider
  public Object[][] dp() 
  {
   Object data[][]=new Object[5][2];
   Statement st;
   ResultSet result;
    /*data[0][0]="sys";
    data[0][1]="Newuser123";
    data[1][0]="system";
    data[1][1]="Newuser123";
    data[2][0]="sysfffem";
    data[2][1]="Newuser123";
    return data;*/
	/*Excel.ExcelConfig(prop.getProperty("excelpath"), prop.getProperty("sheetname", "Sheet1") );
	  int row=Excel.LastRowNum();
	  Object data[][]=new Object[row+1][2];
	  for(int i=0;i<=row;i++) {
		  data[i][0]=Excel.Read(i, 0);
		  data[i][1]=Excel.Read(i,1);*/
	  try {
		  st=conn.createStatement();
		  result=st.executeQuery("select * from Sel");
		  int i=0;
		  while(result.next())
		  {
			  data[i][0]=result.getString(1);
			  System.out.println("12");
			  System.out.println(data[i][0]);
			  data[i][1]=result.getString(2);
			  i++;
		  }
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	return data;
	
    }
    
   /* @AfterMethod
    public void afterMethod(ITestResult R) throws Exception 

    {
  	  if(R.getStatus()==ITestResult.FAILURE)
  	  {
  		  TakesScreenshot t=(TakesScreenshot)driver;
  		  File src=t.getScreenshotAs(OutputType.FILE);
  		  FileUtils.copyFile(src, new File(".\\"+R.getName()+".png"));
  	  }
    }*/


  /*@BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }*/

  /*@BeforeTest
  public void beforeTest() {
	  
  }*/

 /* @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
*/
}
