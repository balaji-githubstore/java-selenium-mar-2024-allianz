package com.allianz.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3Js {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");

		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();

		driver.findElement(By.cssSelector("#citiCard1")).sendKeys("3333");
		driver.findElement(By.cssSelector("input[name='citiCard2']")).sendKeys("3333");
		driver.findElement(By.cssSelector("[name='citiCard3']")).sendKeys("3333");
		driver.findElement(By.cssSelector("#citiCard4")).sendKeys("3333");
		// approach 1 - not working
		// driver.findElement(By.id("bill-date-long")).sendKeys("08/08/2007");

		// approach 2 - working
//		driver.findElement(By.id("bill-date-long")).click();
//		Select selectYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		selectYear.selectByVisibleText("2017");
//		Select selectMon=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		selectMon.selectByVisibleText("Aug");
//		driver.findElement(By.linkText("17")).click();

		// approach 3 - js
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#bill-date-long').value='17/08/2017'");

		// approach 4 - js
		WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		js.executeScript("arguments[0].value='17/08/2017'",ele1);

	}

}
