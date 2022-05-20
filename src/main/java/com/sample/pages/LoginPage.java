package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='inputEmail']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='submitLogin']")
	WebElement submitbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPageTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	
	public void enterusernameAndPassword() {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		submitbtn.click();
	}
	
}