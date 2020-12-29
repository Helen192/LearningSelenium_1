package TestLession1;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearching {
	@Test
	public void webTest() {
		open("http://gokisoft.com/");
//		$(By.xpath("//input[@type = 'text']")).setValue("sql");
		$(By.id("s_tmp")).setValue("sql");
		sleep(1000);
		$(By.xpath("//button[@type = 'submit']")).click();
		sleep(3000);
	}

}
