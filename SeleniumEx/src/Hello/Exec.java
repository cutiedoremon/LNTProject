package Hello;

import org.testng.annotations.Test;

public class Exec {
  @Test
  public void f()
  {

Excel.ExcelConfig("C:\\1SEL\\Key\\Book1.xls","Sheet1" );
		
		for(int i=1;i<=Excel.LastRowNum();i++)
		{
		String A=Excel.Read(i, 0);
		switch(A)
		{
		case "openBrowser":
			KeyConfig.openBrowser(Excel.Read(i, 3));
			break;
		case "openUrl":
			KeyConfig.openUrl(Excel.Read(i, 3));
			break;
		case "entetText":
			KeyConfig.enterText(Excel.Read(i, 1), Excel.Read(i, 2), Excel.Read(i, 3));
			break;
		case "click":
			KeyConfig.click(Excel.Read(i, 1), Excel.Read(i, 2));
			break;
		case "dropdownSelect"://for dropdown button
			KeyConfig.dropdownSelect(Excel.Read(i, 1), Excel.Read(i, 2), Excel.Read(i, 3));
			break;
		
			
		
		}

	}
  }
}
