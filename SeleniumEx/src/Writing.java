import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing 
{
public static void main(String[] args) throws Exception
{
	FileInputStream input=new FileInputStream("C:\\Users\\vshadmin\\Desktop\\xlsx.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	sheet.createRow(3).createCell(2).setCellValue("PAMA");
	 sheet.getRow(2).createCell(2).setCellValue("PAMA");
	 
	 sheet.createRow(4).createCell(2).setCellValue("ANUPAMA");
	 
	 FileOutputStream OP=new FileOutputStream("C:\\\\Users\\\\vshadmin\\\\Desktop\\\\Anu.xlsx");
	 wb.write(OP);
		}
}
