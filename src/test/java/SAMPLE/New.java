package SAMPLE;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class New {

	WebDriver driver;
		//https://www.simpplr.com/blog/2022/what-is-the-employee-experience-and-how-does-it-impact-your-business/

	@BeforeTest
	
	public void initialisation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\DemoProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.simpplr.com/blog/2022/what-is-the-employee-experience-and-how-does-it-impact-your-business/");
		
	}
	
	@Test
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	
	public void validateText() {
		
		String text="Employee";
		System.out.println(text);
		List <WebElement>element=driver.findElements(By.xpath("//*[contains(text(),'Employee')]"));
		
		//String element2=element.getText();
		for(int i=0;i<element.size();i++) {
		System.out.println(element.get(i).getText());
		String expresult=element.get(i).getText();
		if(expresult.contains(text)) {
			System.out.println("Element present");
			
		}
		
		else
			System.out.println("Element not present");
	}
	}
}
