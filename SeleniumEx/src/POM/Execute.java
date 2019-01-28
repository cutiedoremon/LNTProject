package POM;

import org.testng.annotations.Test;

public class Execute extends Base {
  @Test
  public void f() throws Exception 
  {
	  LoginPOM ln=new LoginPOM(driver);
	  SQLCommand sql=new SQLCommand(driver);
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
	  ln.LoginProcess("system", "Newuser123");
	 // sql.LogoutProcess();
	  sql.goToSql();
	  sql.goToSqlcmd();
	  sql.run();
	  Thread.sleep(2000);
	  sql.dropdown();
	  Thread.sleep(2000);
	  sql.explain();
	  Thread.sleep(2000);
	  sql.describe();
	  Thread.sleep(2000);
	  sql.savedsql();
	  Thread.sleep(2000);
	  sql.history();
	  Thread.sleep(2000);
	  sql.home();
	  
  }
}
