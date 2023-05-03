package Testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class  Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver
		System.setProperty ("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
				 // ouvrir chrome
				WebDriver driver = new ChromeDriver ();
				// Maximase la fenetre
				driver.manage().window().maximize();
				// ouvrir URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				// sleep
				Thread.sleep(5000);
				// identification de web Element
				WebElement user ;
				user = driver.findElement(By.name("username"));
				// action
				            			
						user.sendKeys("Admin");
				// identification de passeword
						WebElement passeword;
						passeword= driver.findElement(By.name("password"));
					// action
						passeword.sendKeys("admin123");
						// identification bouton
						WebElement bouton ;
						bouton= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
								bouton.click();
								Thread.sleep(5000);
								// vérification
								// identification d'élément
								WebElement profil ;
								profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
								String text;
								text=profil.getText() ;
								// Assert
								Assert.assertEquals("Paul Collings",text);
								// Affichage
								System.out.println("test ok");
								
									
							
}
}
								
						
					
				
					
			
				
				
						
			
						
				
				
			
				
				
         

	


