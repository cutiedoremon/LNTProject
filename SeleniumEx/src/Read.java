import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read {
public static void main(String[] args) throws Exception
{
	 System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
	FileInputStream input=new FileInputStream("C:\\Users\\vshadmin\\Desktop\\xlsx.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	for(int i=0;i<=sheet.getLastRowNum();i++) {
		//for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) 
		{
			  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:2205463926793294090::NO:::");
			  String HomePagetitle=driver.getTitle();
			String username=sheet.getRow(i).getCell(0).toString();
			System.out.println("Username:" +username);
			driver.findElement(By.cssSelector("input[name='p_t01']")).clear();
			driver.findElement(By.cssSelector("input[name='p_t01']")).sendKeys(username);
			String password=sheet.getRow(i).getCell(1).toString();
			System.out.println("Password:" +password);
			driver.findElement(By.cssSelector("input[name='p_t02']")).clear();
			  driver.findElement(By.cssSelector("input[name='p_t02']")).sendKeys(password);
			  driver.findElement(By.cssSelector("input[type='BUTTON']")).click();
			  String Logintitle=driver.getTitle();
			  if(HomePagetitle.equals(Logintitle))
			  {
				  System.out.println("Login Failed");
				  sheet.getRow(i).createCell(2).setCellValue("Login Failed");
			  }
			  else {
				  System.out.println("Login Successful");
				  sheet.getRow(i).createCell(2).setCellValue("Login Successful");
			  }
		 }
		}
	 FileOutputStream OP=new FileOutputStream("C:\\\\Users\\\\vshadmin\\\\Desktop\\\\loginTestRes.xlsx");
	 wb.write(OP);
	}


	
}

