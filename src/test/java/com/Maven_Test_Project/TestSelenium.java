package com.Maven_Test_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClasses.BaseClass;

public class TestSelenium extends BaseClass {
public static void main(String[] args) throws Exception {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91814\\eclipse-workspace\\Maven_Test_Project\\Web_Driver\\chromedriver.exe");
//	WebDriver vj = new ChromeDriver();
	browserLaunch("firefox");
	windowsMaximize();
	getURL("https://www.facebook.com/");
	findElementWithIDandSendKeys("email", "Vijay");
	takeScreenShot("vj");
}
}
