package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrap {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		
		 List<WebElement> list=driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul"));
		 
		 for(WebElement ele:list) {

           String value=ele.getText();
           
           if(value.equals("HTML")) {

               ele.click();

               break;
           }
		 }
		 driver.close();
  }
}

		 
		 
		 
		

  
