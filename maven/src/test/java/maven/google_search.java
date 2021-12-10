package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google_search {
	WebDriver driver;
	
	
	@Test
	public void search() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Infosys");
		
		Thread.sleep(2000);
		
		List<WebElement> search=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		for(int i=0;i<search.size();i++) {
			String items=search.get(i).getText();
			
			if(items.contains("Infosys Nagpur"))
			{
				search.get(i).click();
				break;
				
			}
			
		}
	}
}
		
		
	


