package com.tricentis.sampleapp.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	
	public static WebDriver driver;
	
	public static void open(String url) {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
	}
	
	public static void close() {
		driver.close();
		driver = null;
	}
	
	public static WebElement seletorCss(String valor) {
		return Configuration.driver.findElement(By.cssSelector(valor));
	}
}
