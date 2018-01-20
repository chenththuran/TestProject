package com.testproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage  navigateToHomePage(){
		driver.navigate().to("http://automationpractice.com/index.php");
		return new HomePage(driver);
	}
	
	public void closeDriver(){
		driver.quit();
	}

}
