import java.io.IOException;

public class UseExcel {
	public static void main(String[] args) throws IOException 
	{
		Excel.ExcelConfig("C:\\\\Users\\\\vshadmin\\\\Desktop\\\\loginTestRes.xlsx","Sheet1" );
		System.out.println(Excel.LastRowNum());
		System.out.println(Excel.Read(1, 0));
		Excel.Write("PAMA", 7, 0);
		System.out.println(Excel.Read(7, 0));
		Excel.Export("C:\\\\Users\\\\vshadmin\\\\Desktop\\\\Test4.xlsx");
	}
}
