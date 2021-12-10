package maven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pin_code {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;


	@Test
	public void search() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	

		test.log(LogStatus.INFO,"Navigating to url");
		driver.get("https://chennaiiq.com/india/pincode/?id=20&state_name=Maharashtra");
		driver.manage().window().maximize();
		test.log(LogStatus.PASS,"Successfully navigate");


		WebElement Akurdi=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/center/table[2]/tbody/tr[283]/td[5]"));
		WebElement Ahmednagar=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/center/table[2]/tbody/tr[307]/td[5]"));

		String PinCode1=Akurdi.getText();
		String PinCode2=Ahmednagar.getText();

		Assert.assertNotEquals(PinCode1, PinCode2);
		System.out.println("Assertions Passed");


		driver.quit();
		driver.close();
	}

	@BeforeClass
	public void report() {
		report = new ExtentReports("report.html");

		test = report.startTest("ExtentDemo");

	}

	@AfterClass
	public void reports() {
		//		driver.quit();
		//		driver.close();

		report.endTest(test);
		report.flush();

	}
}






