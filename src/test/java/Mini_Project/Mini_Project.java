package Mini_Project;

import java.lang.module.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseClasses.BaseClass;
import com.Configuration.Config;
import com.POM.Manager;

public class Mini_Project extends BaseClass {
public static void main(String[] args) throws Throwable {
	browserLaunch("chrome");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Manager vj = new Manager(driver);
	Config cf = new Config();
	getURL(cf.getUrl());
	String user = cf.getUser();
	inputElement(vj.getLogin().getUser(), user);
	
	
//	findElementWithIDandSendKeys("password", "12345678");
//	takeScreenShot("Home");
//	findElementWithIDandClick("login");
//	WebElement loc = driver.findElement(By.id("location"));
//	Dropdown(loc, "index", "8");
//	WebElement hotel = driver.findElement(By.id("hotels"));
//	Dropdown(hotel, "index", "3");
//	WebElement room = driver.findElement(By.id("room_type"));
//	Dropdown(room, "index", "2");
//	WebElement roomnos = driver.findElement(By.id("room_nos"));
//	Dropdown(roomnos, "index", "1");
//	js.executeScript("document.getElementById('datepick_in').value='06/12/2022';");
//	js.executeScript("document.getElementById('datepick_out').value='07/12/2022';");
//	WebElement adult = driver.findElement(By.id("adult_room"));
//	Dropdown(adult, "index", "2");
//	WebElement child = driver.findElement(By.id("child_room"));
//	Dropdown(child, "index", "1");
//	takeScreenShot("Details");
//	findElementWithIDandClick("Submit");
//	findElementWithIDandClick("radiobutton_0");
//	findElementWithIDandClick("continue");
//	findElementWithIDandSendKeys("first_name", "Vijay");
//	findElementWithIDandSendKeys("last_name", "Sekar");
//	findElementWithIDandSendKeys("address", "Walajapet");
//	findElementWithIDandSendKeys("cc_num", "1234567890123456");
//	WebElement cctype = driver.findElement(By.id("cc_type"));
//	Dropdown(cctype, "index", "3");
//	WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
//	Dropdown(ccexp, "index", "11");
//	WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
//	Dropdown(ccexpyear, "index", "12");
//	findElementWithIDandSendKeys("cc_cvv", "123");
//	takeScreenShot("All_Details");
//	findElementWithIDandClick("book_now");
//	findElementWithIDandClick("my_itinerary");
//	driver.findElement(By.xpath("//input[@value='791021']")).click();
//	takeScreenShot("Selected");
//	findElementWithIDandClick("logout");
}
}
