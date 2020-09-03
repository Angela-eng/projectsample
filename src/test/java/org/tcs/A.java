package org.tcs;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
WebDriver driver;
	
	@BeforeClass
	private void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();

	}
	@BeforeMethod
	public void StartTime() {
		
		Date d=new Date();
		System.out.println(d);

	}
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	public void quitBrowser() {
		driver.quit();

	}
	@Test
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("java");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("hello");
		WebElement btnlogin=driver.findElement(By.id("u_0_b"));
		btnlogin.click();


}
