package com.Nykaa_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClasses.BaseClass;

public class nykkaTest extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("chrome");
		getURL("https://www.nykaa.com/hair-care/hair/shampoo/c/316?ptype=lst&id=316&root=nav_3&dir=desc&order=popularity");
		Actions ac =  new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[2]/div/button[2]/span")).click();
		
	}	
}
