package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final {
	public WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;

	@FindBy(xpath = "//input[@value='791021']")
	private WebElement FinalSelect;

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public WebElement getFinalSelect() {
		return FinalSelect;
	}

	public Final(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
