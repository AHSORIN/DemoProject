package TestngSample;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class trello {
	 WebDriver driver;
	
	@BeforeTest
	public void initialisation() {
		
		System.setProperty("webdriver.chrome.driver", "https://trello.com/en/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	
		
	}
	
	@Test(priority=1)
	public void loginTest() {
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("nirosha1.yadla@gmail.com");
		
		
	}

}
