package com.testproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends AbstractPage {
	
	@FindBy(id = "email_create")
	WebElement emailAddress;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreateBtn;
	
	
	public AuthenticationPage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);

	}

	

	public AuthenticationPage setCreateAccountEmailAddress(String email) {
		emailAddress.sendKeys(email);
		return new AuthenticationPage(driver);

	}
	
	public CreateAccountPage  navigateToCreateAccountPage(){
		submitCreateBtn.click();
		return new CreateAccountPage(driver);
	}
	
	
	

}
