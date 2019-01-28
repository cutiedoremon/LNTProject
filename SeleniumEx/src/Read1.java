import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1 {
public static void main(String[] args) throws Exception
{
	FileInputStream input=new FileInputStream("C:\\Users\\vshadmin\\Desktop\\xlsx.xlsx");
	FileOutputStream OP=new FileOutputStream("C:\\\\Users\\\\vshadmin\\\\Desktop\\\\xlsxResult.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	String data[]=new String[sheet.getLastRowNum()*2];
	for(int i=0;i<=sheet.getLastRowNum();i++) {
	for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) 
		{
		     data[i]=sheet.getRow(i).getCell(j).toString();
		     
		     if(j==0) {
		    	 System.out.println("Username:" +data[i]);}
		     if(j==1) {
		    	 System.out.println("Password:" +data[i]);}
		}
	}
}
}
