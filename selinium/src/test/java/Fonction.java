import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Fonction {

	public static void main(String[] args) {
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
		WebElement bouton2 ;
		bouton2= driver.findElement(By.id("doubleClickBtn"));
		
		action.contextClick(bouton2).perform();
		 // Assert
		WebElement msg2 ;
		msg2=driver.findElement(By.id("rightClickMessage"));
		String text ;
		text=msg2.getText();
		Assert.assertEquals(text, "you have done a right click");
		System.out.println("test ok");
		

	}

}
