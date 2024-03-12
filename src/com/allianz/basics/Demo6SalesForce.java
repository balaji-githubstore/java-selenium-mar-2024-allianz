package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6SalesForce {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");
		driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("will");
		
		
		//Select Job title as “IT Manager”
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");
		
		//Select country as “United Kingdom”
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		
		//enter company name as allianz
		driver.findElement(By.name("CompanyName")).sendKeys("allianz");
		
		//click on checkbox
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		

	}

}
