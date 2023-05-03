package Testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateurJava {

	public static void main(String[] args) {
		// chemin de chrome driver PATH
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// ouverture chrome
		WebDriver driver = new ChromeDriver ();
		// Maximase la fenetre
		driver.manage().window().maximize();
		// delete Cookies
		driver.manage().deleteAllCookies();
		// ouvrir URL
		driver.get("");
		
			
		
		

	}

	
	

}
