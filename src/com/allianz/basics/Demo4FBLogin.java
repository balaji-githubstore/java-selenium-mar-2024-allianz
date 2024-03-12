package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter username ashello12345677@gmail.com
		
	
		
//		By loc=By.id("email");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("hello2233333@gmail.com");
		
//		WebElement ele= driver.findElement(By.id("email"));
//		ele.sendKeys("hello2233333@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("hello12345@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("jacl123");
		
		//click on login
		driver.findElement(By.name("login")).click();

	}

}
