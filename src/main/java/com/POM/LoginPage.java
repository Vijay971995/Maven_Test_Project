package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement user;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getPass() {
		return pass;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getLogin() {
		return login;
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
