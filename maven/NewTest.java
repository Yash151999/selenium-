import org.testng.annotations.Test;

import selenium.ChromeDriver;
import selenium.WebDriver;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver;
	  

		@BeforeClass
		public static void startTest()
		{
		report = new ExtentReports(System.getProperty("user.dir")+"C:\\Users\\Desktop\\Image.html");
		test = report.startTest("ExtentReport");
		}
	  
	  
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://lex.infosysapps.com/en/login");
			String title=driver.getTitle();
			System.out.println(title);
			if(driver.getTitle().equals("Lex"))
			{
			test.log(LogStatus.PASS, "Navigated Successful");
			}
			else
			{
			test.log(LogStatus.FAIL, "Test Failed");
			}
			}

		@AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}
			
  }
}
