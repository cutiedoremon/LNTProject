package Hello;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class CSVExample {
  @Test
  public void f() throws Exception 
  {
	  CSVReader CR=new CSVReader(new FileReader("C:\\Users\\vshadmin\\Desktop\\data.csv"));
	  List<String[]> allData=CR.readAll();
	  for(String[] str:allData)
	  {
		  for(String data:str)
		  {
			  System.out.println(data);
		  }
	  }
	  
  }
}

