import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

	public static void main(String[] args) {
		// chemin de chrome driver
		 System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		 // ouvrir chrome
		WebDriver driver = new ChromeDriver ();
		// Maximase la fenetre
		driver.manage().window().maximize();
		// implicity wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement liste;
		liste=driver.findElement(By.id("oldSelectMenu"));
		// appel fonction select 
		Select listeD= new Select (liste);
		listeD.selectByValue("5");
		System.out.println("test ok");
		
		
	

	}

}
