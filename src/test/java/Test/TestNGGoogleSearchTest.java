package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

public class TestNGGoogleSearchTest {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.id.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\iedriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	@Test
	public static void googleSearch() {
		
		driver.get("https://google.com/");
		
		//enter text in search textbox
//		driver.findElement(By.name("q")).sendKeys("Java tutorial");
		GoogleSearchPage.textboxSearch(driver).sendKeys("Java tutorial");
		
		// click on search button
//		driver.findElement(By.xpath("//button[@id= 'search-icon-legacy']")).click();
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		// close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully");
	}

}
