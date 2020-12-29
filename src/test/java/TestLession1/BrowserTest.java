package TestLession1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		// Test voi Firefox
//		String projectPath = System.getProperty("user.dir");  // tim ra duong link cua project
//		System.out.println("ProjectPath: " + projectPath);
//		
//		// cach 1:
////		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
//		
//		// cach 2: 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.dev/");
		driver.close();
//		
		// Test voi Chrome
//		String projectPath = System.getProperty("user.dir");  // tim ra duong link cua project
//		System.out.println("ProjectPath: " + projectPath);
		// cach 1:
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		// cach 2: 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://selenium.dev/");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// test voi internet explorer
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\PetClinicTest\\drivers\\iedriver\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://selenium.dev/");
//		driver.close();
	}

}
