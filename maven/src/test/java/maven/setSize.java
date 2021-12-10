package maven;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class setSize {

	
	WebDriver driver;

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420,600);
		driver.manage().window().setSize(d);
	}
}
