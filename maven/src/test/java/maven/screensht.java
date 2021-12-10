package maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class screensht {
	
	WebDriver driver = null;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe"); 
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testCase() throws IOException {
	   File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file,new File("C:\\Users\\Desktop\\\\Image.png"));
	}
	
	@AfterClass
	public void setEnd(String fileName) {

	}

}
