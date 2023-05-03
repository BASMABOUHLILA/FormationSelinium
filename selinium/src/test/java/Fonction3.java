import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Fonction3 {

	public static void main(String[] args) {
		// // chemin de chrome driver
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		 // ouvrir chrome
		WebDriver driver = new ChromeDriver ();
		// Maximase la fenetre
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		
		// identification du web element
		WebElement bouton3 ;
		bouton3= driver.findElement(By.id("//div[3]//button[1]"));
		Actions action= new Actions (driver);
		action.click(bouton3).perform();
		 // Assert
		WebElement msg3 ;
		msg3=driver.findElement(By.xpath("dynamicClickMessage"));
		String text ;
		text=msg3.getText();
		Assert.assertEquals(text, "You have done a dynamic click");
		System.out.println("test ok");
		
		
		
		
		
		
	}

}
