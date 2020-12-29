package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearchTest {
	public static void main(String[] args) {
		youtubeSearch();
	}
	
	public static void youtubeSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		
		//enter text in search textbox
		driver.findElement(By.name("search-query")).sendKeys("Java tutorial");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// click on search button
		driver.findElement(By.xpath("//button[@id= 'search-icon-legacy']")).click();
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		// close browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
