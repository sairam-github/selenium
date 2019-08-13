import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test()
public class PtcHomeTest {
	public String baseUrl = "https://www.ptc.com/";
	public ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDev\\workspace\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ptc.com/");
	}
	
	@Test()
	public void testHomeNavigation() {
		WebElement contactUs = driver.findElement(By.linkText("LET'S GO"));
		contactUs.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement home = driver.findElement(By.className("logo"));
		home.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void closeSetup() {
		driver.quit();
	}
}