package com.allianz.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2FB {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
//		get the title and print it
//		get the current url and print it
//		get the page source and print it
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		String pageSource=driver.getPageSource();
		
		System.out.println(pageSource);
		
		driver.quit();
	}

}
