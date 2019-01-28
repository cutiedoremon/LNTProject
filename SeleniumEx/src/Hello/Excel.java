package Hello;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel
	{
		
		static Sheet sheet;
		static Workbook wb;
		
		public WebDriver setDriver(){
			System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    return driver;}
	public static void ExcelConfig(String Location,String SheetName)
	{
		try
		{
			FileInputStream input=new FileInputStream(Location);
			if(Location.endsWith(".xls"))
			{
				wb=new HSSFWorkbook(input);
			}
			else if(Location.endsWith(".xlsx"))
			{
				wb=new XSSFWorkbook(input);
			}
			sheet=wb.getSheet(SheetName);
		}catch (Exception e)
		{
			System.out.println("Error with file" +e.getMessage());
		}
	}
	public static String Read(int R,int C)
	{
		return sheet.getRow(R).getCell(C).toString();
		
	}
	public static int LastRowNum()
	{
		return sheet.getLastRowNum();
	}
	public static void Write(String data,int R,int C)
	{
		try
		{
		sheet.getRow(R).getCell(C).setCellValue(data);
		}
		catch(NullPointerException N1)
		{
			try {
			sheet.getRow(R).createCell(C).setCellValue(data);
			}
			catch(NullPointerException N2){
				try {
				sheet.createRow(R).createCell(C).setCellValue(data);
				}
					catch(NullPointerException N4) {
					System.out.println("Failed to write data"+N4.getMessage());
					}
				}
			}
			
		}
		
	
	public static void Export(String Location) throws IOException
	{
		 FileOutputStream OP=new FileOutputStream(Location);
		 wb.write(OP);
	}
	
	}
	

