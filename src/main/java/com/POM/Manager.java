package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Configuration.Config;

public class Manager {
	public WebDriver driver;
	private Basic_Details basic;
	private Final finals;
	private LoginPage login;
	private Search_Hotel searchHotel;
	private Select_Hotel selectHotel;
	private Config config;

	public Basic_Details getBasic() {
		return basic;
	}

	public Final getFinals() {
		return finals;
	}

	public LoginPage getLogin() {
		return login;
	}

	public Search_Hotel getSearchHotel() {
		return searchHotel;
	}

	public Select_Hotel getSelectHotel() {
		return selectHotel;
	}

	public Config getConfig() {
		return config;
	}

	public Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
