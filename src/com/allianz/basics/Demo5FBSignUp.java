package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com"); //wait for page load to complete
		
		//findElement -> Check for presence of element in 0.5s
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		//enter lastname as wick
		//enter password as test123
		
		
		//14 apr 1970
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
//		selectMonth.selectByValue("4");
//		selectMonth.selectByIndex(3);
		
		//select year as 1970
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1970");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.name("websubmit")).click();

	}

}
