package maven;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Extent_class {
	ExtentReports report;
	ExtentTest test;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lex.infosysapps.com/en/login");
		if(driver.getTitle().equals("Lex"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
  }
  @BeforeClass
  public void beforeClass() {
	   report = new ExtentReports("report.html");
	 // ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html",False);
	   test = report.startTest("ExtentDemo");
  }

  @AfterClass
  public void afterClass() {
	  report.endTest(test);
		report.flush();
  }

}
