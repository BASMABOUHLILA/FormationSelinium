import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class FonctionClick {

	public static void main(String[] args) throws InterruptedException {
		 // chemin de chrome driver
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		 // ouvrir chrome
		WebDriver driver = new ChromeDriver ();
		// Maximase la fenetre
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		driver.get("https://demoqa.com/buttons");
		
		// identification du web element
		WebElement bouton1 ;
		bouton1= driver.findElement (By.id("doubleClickBtn"));
		Actions action= new Actions (driver);
		action.doubleClick(bouton1).perform();
		 // Assert
		WebElement msg ;
		msg=driver.findElement(By.id("\"doubleClickMessage\""));
		String text ;
		
		Assert.assertEquals("texte", "you have done double click");
		System.out.println("test ok");
		
		
			
		
		
		
		
		
		
		
		
		
		

	}

}
