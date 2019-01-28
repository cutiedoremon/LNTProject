package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SQLCommand 
{
	WebDriver driver;
	SQLCommand(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logout=By.linkText("Logout");
	By sql=By.linkText("SQL");
	By sqlcmd=By.linkText("SQL Commands");
	By enterQuery=By.name("p_t04");
	By run=By.cssSelector("input[value='Run']");
	By dropdown=By.id("P1003_ROWS");
	By explain=By.id("explain_tab");
	By describe=By.id("describe_tab");
	By savedsql=By.id("savedsql_tab");
	By history=By.id("history_tab");
	By home=By.linkText("Home");
	public void LogoutProcess()
	{
		driver.findElement(logout).click();
	}
	public void goToSql()
	{
		driver.findElement(sql).click();
		
	}
	public void goToSqlcmd()
	{
		driver.findElement(sqlcmd).click();
		
	}
	public void run()
	{
		driver.findElement(enterQuery).sendKeys("select * from Sel");
		driver.findElement(run).click();
	}
	public void dropdown()
	{
		Select s=new Select(driver.findElement(dropdown));
		s.selectByVisibleText("50");
	}
	public void explain() {
		driver.findElement(explain).click();
		
	}
	public void describe() {
		driver.findElement(describe).click();
		
	}
	public void savedsql() {
		driver.findElement(savedsql).click();
		
	}
	public void history() {
		driver.findElement(history).click();
		
	}
	public void home()
	{
		driver.findElement(home).click();
	}

}
