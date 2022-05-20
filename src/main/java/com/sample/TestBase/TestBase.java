package com.sample.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sample.Utilities.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		try {
			prop=new Properties();
			FileInputStream fs=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\DemoProject\\src\\main\\java\\com\\sample\\config\\config.Properties");
		     prop.load(fs);
		     
		
		
		}
		catch(Exception e) {
	        e.printStackTrace();
			
		}
	}
		
		public static void initialization(){
			 
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\hp\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe" );
			    driver=new ChromeDriver();
			   driver.manage().deleteAllCookies();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			   driver.get(prop.getProperty("url"));
			}
			 	
		}
		
		
		
		
	

}


