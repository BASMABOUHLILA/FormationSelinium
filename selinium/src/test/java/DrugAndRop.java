import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DrugAndRop {

	public static void main(String[] args) {
		// // // chemin de chrome driver
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		 // ouvrir chrome
		WebDriver driver = new ChromeDriver ();
		// Maximase la fenetre
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		// identification du web element
		WebElement from  ;
		from=driver.findElement(By.id("draggable"));
		WebElement to ;
		to = driver.findElement(By.id("droppable"));
		Actions action= new Actions (driver);
		action.dragAndDrop(from, to).perform();
		String text ;
		text=to.getText();
		Assert.assertEquals(text, "Dropped!");
		System.out.println("test ok");
		
		
		
		
		
		
		

	}

}
