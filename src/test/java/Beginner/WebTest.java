package Beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gokisoft.com/");
//		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"input\"]"));
//		WebElement textBox = driver.findElement(By.id("lst-ib"));
		WebElement textBox = driver.findElement(By.xpath("//input[@id='s_tmp']"));
		textBox.sendKeys("sql");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
