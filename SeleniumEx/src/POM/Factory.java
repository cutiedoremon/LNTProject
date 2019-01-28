package POM;

import org.testng.annotations.Test;

import Hello.LoginFactory;

public class Factory extends Base{
  @Test
  public void f() {
	  LoginFactory lf=new  LoginFactory(driver);
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
	  lf.LoginProcess("sys","Newuser123");
	  lf.LinkTest();
  }
  
}
