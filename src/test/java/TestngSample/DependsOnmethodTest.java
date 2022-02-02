package TestngSample;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnmethodTest {

	
	WebDriver driver=null;
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\hp\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe" );
		    driver=new ChromeDriver();
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		   driver.get("https://www.spicejet.com//");
	  }
	  
	  @Test
	  public void getTitleWebsite() {
		  String Title=driver.getTitle();
		  
		  Assert.assertTrue(Title.equalsIgnoreCase("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets"));
		  System.out.println("TITLE" +Title); 
	  }
	  
	  @Test(dependsOnMethods = "getTitleWebsite")
	  public void message() {
		  System.out.println("Hello");
			System.out.println("Welcome!!!");
		  
	  }
	  
	  @AfterTest
	  
	  public void tearDown() {
		  driver.quit();
	  }
}
