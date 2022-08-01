package com.testing.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Rediff_TestNG_Java {

	public static WebDriver driver;
	@Test
	public void loginCheck() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	WebElement username = driver.findElement(By.xpath("//input[@id = 'login1']"));
	WebElement password = driver.findElement(By.xpath("//input[@id = 'password']"));
	if(username.isEnabled()&&username.isDisplayed()&&password.isEnabled()&&password.isDisplayed()) {
		username.sendKeys("seleniumpanda@rediffmail.com");
		password.sendKeys("Selenium@123");
	}else {
		System.out.println("The username and password web elements do not exist");
	}
	
	}	
}
																																																																																																																																														