package com.BaseClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	// Static WebDriver
	public static WebDriver driver;

	// Action Methods
	public static void actionMethods(String option, WebElement element, WebDriver driver) {

		Actions ac = new Actions(driver);
		if (option.equalsIgnoreCase("click")) {
			ac.click(element).perform();
			;
		} else if (option.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).perform();
		} else if (option.equalsIgnoreCase("clickandhold")) {
			ac.clickAndHold(element).perform();
		} else if (option.equalsIgnoreCase("release")) {
			ac.release(element).perform();
		} else if (option.equalsIgnoreCase("contextclick")) {
			ac.contextClick(element).perform();
		} else if (option.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).perform();
		}
	}

	public static void dragAndDrop(WebElement element, WebElement element1, WebDriver driver) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element1);
	}

	// Click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// SendKeys
	public static void inputElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// DriverLaunch
	public static WebDriver browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (value.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (value.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Drivers\\operadriver.exe");
			driver = new OperaDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	// find element with id and also pass send keys
	public static void findElementWithIDandSendKeys(String ID, String value) {
		driver.findElement(By.id(ID)).sendKeys(value);
	}

	// find element with id and also pass send keys
	public static void findElementWithNameandSendKeys(String ID, String value) {
		driver.findElement(By.name(ID)).sendKeys(value);
	}

	// find Element With ID and Click
	public static void findElementWithIDandClick(String ID) {
		driver.findElement(By.id(ID)).click();
	}

	// JavaScript Executor with value
	private void jsExecutorwithValue(String ID, String Value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("document.getElementById('"+ID+"').value='"+Value+"';");
	}

	// get URL
	public static void getURL(String URL) {
		driver.get(URL);
	}

	// Implicitly Wait
	public static void waitImplicity() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	// Maximize
	public static void windowsMaximize() {
		driver.manage().window().maximize();
	}

	// Navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Close
	public static void close() {
		driver.close();
	}

	// Quit
	public static void quit() {
		driver.quit();
	}

	// Frame
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}

	// Default Frame
	public static void degaultFrames() {
		driver.switchTo().defaultContent();
	}

	// Alert
	public static void alert() {
		driver.switchTo().alert().accept();
	}

	// Navigate Options
	public static void navigateOptions(String Option) {
		if (Option.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (Option.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (Option.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	// Screen Shot
	public static void takeScreenShot(String ImageName) throws Exception {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\Screenshot\\" + ImageName + ".png"));
	}

	// Single DropDown
	public static void Dropdown(WebElement element, String option, String svalue) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(svalue);
		} else if (option.equalsIgnoreCase("Visibletext")) {
			s.selectByVisibleText(svalue);
		} else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(svalue);
			s.selectByIndex(parseInt);
		}
	}

	// isEnalbe
	public static void isCheck(WebElement element, String option) {
		if (option.equalsIgnoreCase("enable")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} else if (option.equalsIgnoreCase("disable")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} else if (option.equalsIgnoreCase("selected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	}

	// ScreenShot for 4 Lines
	public static void Screenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\91979\\eclipse-workspace\\Maven_Project\\ScreenShot\\" + name + ".png");
		FileUtils.copyFile(src, loc);

	}

	// Find Element
//	public static void findElementOptions(String Option, String Value, WebElement findElement) {
//		
//		if (Option.equalsIgnoreCase("id")) {
//	 driver.findElement(By.id(Value));
//		}
//		
//		
//		else if (Option.equalsIgnoreCase("name")) {
//			WebElement findElement = driver.findElement(By.name(Value));
//		}
//		else if (Option.equalsIgnoreCase("class")) {
//			WebElement findElement = driver.findElement(By.className(Value));
//		} else if (Option.equalsIgnoreCase("xpath")) {
//			WebElement findElement = driver.findElement(By.xpath(Value));
//		} else if (Option.equalsIgnoreCase("css")) {
//			WebElement findElement = driver.findElement(By.cssSelector(Value));
//		} else if (Option.equalsIgnoreCase("link")) {
//			WebElement findElement = driver.findElement(By.linkText(Value));
//		} else if (Option.equalsIgnoreCase("partiallink")) {
//			WebElement findElement = driver.findElement(By.partialLinkText(Value));
//		}
//
//	}
}
