package com.testing.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	//Hard Assert
		//Soft Assert
		
		public static WebDriver driver;

		@BeforeTest
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    }

		@Test
		public void loginCredentials() {
			Assert.assertTrue(true != false); //true
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			Assert.assertEquals(true, 1<2);
			driver.findElement(By.id("password")).sendKeys("Selenium@123");
			driver.findElement(By.className("signinbtn")).click();
			driver.findElement(By.className("skiplink")).click();
		}

		@AfterTest
		public void logOut() {
			driver.findElement(By.className("rd_logout")).click();
			driver.quit();
		}

	}

