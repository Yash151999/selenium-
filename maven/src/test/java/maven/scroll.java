package maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class scroll {


	WebDriver driver;


	@BeforeClass
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	}

	@AfterClass
	void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	void test() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
	}

}
