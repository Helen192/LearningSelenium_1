package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//enter text in search textbox
//		driver.findElement(By.name("q")).sendKeys("Java tutorial");
		GoogleSearchPage.textboxSearch(driver).sendKeys("Java tutorial");
		
		// click on search button
//		driver.findElement(By.xpath("//button[@id= 'search-icon-legacy']")).click();
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
		
		// close browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
