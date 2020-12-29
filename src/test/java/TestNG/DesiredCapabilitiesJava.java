package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapabilitiesJava {
	@Test
	public void searchTest() throws InterruptedException {
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("ignoreProtectedModeSettings", true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\iedriver\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver(caps);
//		
		
		
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("Java core");
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gokisoft.com/");
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("sql");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
	}

}
