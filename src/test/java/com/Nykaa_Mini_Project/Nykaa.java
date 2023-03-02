package com.Nykaa_Mini_Project;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import com.BaseClasses.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa extends BaseClass {

	public static void main(String[] args) {

		browserLaunch("chrome");
		getURL("https://www.nykaa.com/");
		Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[2]/div[3]/button[1]")).click();
		driver.findElement(By.name("emailMobile")).sendKeys("8148686763");
		driver.findElement(By.id("submitVerification")).click();
		Scanner s = new Scanner(System.in);
		String otp = s.nextLine();
		driver.findElement(By.name("otpValue")).sendKeys(otp);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[1]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[2]/div/ul/li[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[2]/div/div[1]/a/div[1]/img")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).submit();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ac.moveToElement(F).build().perform();
//		driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[6]/ul/li/div/div[1]/div/ul/li[1]/a")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[1]/a/div[1]/img"));
//		js.executeScript("arguments[0].scrollIntoView();", findElement);
//		findElement.click();
//		driver.findElement(By.xpath("//*[@id=\"product-list-wrajjp\"]/div[2]/div/div[2]/div/button[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[2]/div/button[2]']")).click();

	}

}