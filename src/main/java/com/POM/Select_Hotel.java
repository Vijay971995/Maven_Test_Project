package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	@FindBy(id = "continue")
	private WebElement continueElement;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	public WebElement getContinueElement() {
		return continueElement;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public Select_Hotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
