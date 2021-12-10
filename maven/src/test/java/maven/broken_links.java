package maven;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class broken_links {
	 WebDriver driver;
		@BeforeClass
		void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		     driver.get("https://www.zlti.com/");
		     driver.manage().window().maximize();

		}

		@AfterClass
		void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		void test() throws Exception  {
			List <WebElement> links=driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());
			
			for(int i=0;i<links.size();i++) {
			WebElement element = links.get(i);
			
			String url=element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			
			Thread.sleep(2000);
			
			httpConn.connect();
			
			int response_code=httpConn.getResponseCode();
			
			if(response_code==400) {
				System.out.println(url+"is broken");
			}
			else {
				System.out.println(url+"is not broken");
				
			}
			
				
			}
			//System.out.println(url);
		}


}
