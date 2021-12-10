package maven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//import new_tab.Test;

public class newTab {

	 @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		   
		   WebElement link=driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a"));
		   
		 

	Actions actions = new Actions(driver); 
	        actions.keyDown(Keys.LEFT_CONTROL).click(link).keyUp(Keys.LEFT_CONTROL) .build() .perform();

		   
		 
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	 	   
	 	   driver.switchTo().window(tabs.get(1));
		 
		   
		  driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a")).click();
		  
		  
		 
		   
		  driver.findElement(By.id("search_patient")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]/a")).click();
		
		   
	  }
	}

