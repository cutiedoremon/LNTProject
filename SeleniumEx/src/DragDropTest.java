import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\1SEL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameElement=driver.findElement(By.className("demo-frame")) ;
		driver.switchTo().frame(frameElement);
		actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	    driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		
	}

}
