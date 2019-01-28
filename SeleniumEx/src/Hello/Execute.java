package Hello;
import java.io.FileInputStream;
import java.util.Properties;

public class Execute {
 public static void main(String[] args) throws Exception
 {
	 Properties prop=new Properties();
	 prop.load(new FileInputStream(""));
 }
}
