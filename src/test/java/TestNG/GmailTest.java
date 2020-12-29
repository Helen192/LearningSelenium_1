package TestNG;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
/*
 * https://selenide.org/quick-start.html
 */
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;


public class GmailTest {
	
	@Test
	public void testLogin() {
		open("https:mail.google.com");
		$(By.xpath("//input[@type= 'email']")).setValue("dreaming192");
		sleep(1000);
		$(By.xpath("//button[contains(.,'Weiter')]")).click();
		sleep(1000);
	}

}
