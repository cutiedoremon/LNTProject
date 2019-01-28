import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FetchTest extends Excel {
	WebDriver driver=super.setDriver();
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
	  driver.findElement(By.name("p_t01")).sendKeys(n);
	  driver.findElement(By.name("p_t02")).sendKeys(s);
	  driver.findElement(By.name("p_t02")).submit();
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
   /* Object data[][]=new Object[4][2];
    data[0][0]="sys";
    data[0][1]="Newuser123";
    data[1][0]="system";
    data[1][1]="Newuser123";
    data[2][0]="sysfffem";
    data[2][1]="Newuser123";
    return data;*/
	  super.ExcelConfig("C:\\Users\\vshadmin\\Desktop\\xlsx.xlsx", "Sheet1");
	  int row=super.LastRowNum();
	  Object data[][]=new Object[row+1][2];
	  for(int i=0;i<=row;i++) {
		  data[i][0]=super.Read(i, 0);
		  data[i][1]=super.Read(i,1);
		 
	  }
	return data;
    };
    
    @AfterMethod
    public void afterMethod(ITestResult R) throws Exception 

    {
  	  if(R.getStatus()==ITestResult.FAILURE)
  	  {
  		  TakesScreenshot t=(TakesScreenshot)driver;
  		  File src=t.getScreenshotAs(OutputType.FILE);
  		  FileUtils.copyFile(src, new File(".\\"+R.getName()+".png"));
  	  }
    }


  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
