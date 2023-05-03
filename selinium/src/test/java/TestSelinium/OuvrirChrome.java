package TestSelinium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OuvrirChrome {

	public static <Webdriver> void main(String[] args) {
		// chemin de chrome driver PATH
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// Ouvrir chrome
		WebDriver driver = new ChromeDriver ();
	
	
		
	}

}
