package Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

public class TestNGDemo2 {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.id.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\iedriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	@Test
	public static void googleSearch2() {
		
		driver.get("http://gokisoft.com/");
		
		//enter text in search textbox
		driver.findElement(By.id("s_tmp")).sendKeys("sql");
		
		
		// click on search button
//		driver.findElement(By.xpath("//button[@id= 'search-icon-legacy']")).click();
		driver.findElement(By.xpath("//button[@type = 'submit']")).sendKeys(Keys.RETURN);
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		// close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully");
	}

}
