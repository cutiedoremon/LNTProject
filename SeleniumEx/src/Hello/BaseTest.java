package Hello;

import org.testng.annotations.Test;

public class BaseTest {
  @Test(groups= {"smoke"})
  public void f1() {
	  System.out.println("smoke");
	  
  }
  
  @Test(groups= {"regeression","smoke"})
  public void f2() {
	  System.out.println("regeression");
	  
  }
  
  @Test(groups= {"sanity"})
  public void f3() {
	  
	  System.out.println("sanity");
  
  }
  @Test(groups= {"regeression"})
  public void f4() {
	  
	  System.out.println("regeression");
  
  }
}
