package com.testproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	//WebDriver driver;

	@FindBy(css = "a.login")
	WebElement signinLink;

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public AuthenticationPage navigatetoAuthenticationPage() {
		signinLink.click();
		return new AuthenticationPage(driver);

	}

}
