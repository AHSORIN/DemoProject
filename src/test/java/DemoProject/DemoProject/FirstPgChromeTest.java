package DemoProject.DemoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPgChromeTest {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\hp\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe" );
	   WebDriver driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	   driver.get("https://www.spicejet.com//");
	   System.out.println("TITLE" +driver.getTitle());
	   System.out.println("Hello");
	   
	}

}
