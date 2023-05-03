import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertYoutube {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouvrir Chrome
		WebDriver driver = new ChromeDriver();

		// maximase la fenetre
		driver.manage().window().maximize();
		// ouvrir l'URL
		driver.get("https://www.youtube.com/");
		// Sleep
		Thread.sleep(5000);
		// identification de web Element
		WebElement caractere;
		caractere = driver.findElement(By.name("search_query"));
		// action
		caractere.sendKeys("tunisie");
		// identification button
		WebElement bouton;
		bouton = driver.findElement(By.id("search-icon-legacy"));
		bouton.click();

		// vérification (assert)
		// identication d'élémént
		String URL;
		URL = driver.getCurrentUrl();
		Assert.assertEquals("https://www.youtube.com/results?search_query=tunisie", URL);
		System.out.println("test ok");
	}
}
