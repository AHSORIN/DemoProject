package SAMPLE;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class sAMPLE1 {

public WebDriver driver;
	
	@BeforeTest
	
	public void initialisation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.simpplr.com/");
	}
	
	@Test
	
	public void getTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Intranet Software - Employee Intranet Solutions | Simpplr");
	}

}
