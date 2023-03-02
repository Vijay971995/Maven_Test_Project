package com.Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BaseClasses.BaseClass;

public class test extends BaseClass {
	

@Test(priority = 0)
private void browser_Launch() {
	browserLaunch("chrome");
	getURL("https://en.savefrom.net/360/");
	}
	@Test(priority = 1)
	private void get_Element() {
		findElementWithNameandSendKeys("sf_url", "https://www.youtube.com/watch?v=H-NPcPeA3mU");
		findElementWithIDandClick("sf_submit");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/div/div[1]/div[2]/div[2]/div[1]/a"));
	}
}
