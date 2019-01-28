package FM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class Execute {
  @Test
  public void f() throws Exception
  {	Object screen;

Excel.ExcelConfig("C:\\1SEL\\Key\\Book2.xls","Sheet1" );
		
		for(int i=1;i<=Excel.ROWNUM();i++)
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
		case "Screenshot":
			KeyConfig.Screenshot(Excel.Read(i, 1));
			break;
		/*case "closeBrowser" :
			KeyConfig.closeBrowser();
			break;*/
		}

	}
  }
}
