package com.frames;

import java.util.Date;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	WebDriver driver;
	@BeforeClass
	private void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		drdatepick_iniver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
	}
@BeforeMethod
private void Bd() {
 Date date = new Date();
 System.out.println(date);
}
@Parameters({"username","password","datepick_in"})
@Test
private void tc0(String s,String s1,String s2) {
	WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys(s);
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys(s1);
WebElement login = driver.findElement(By.id("login"));
login.click();
	
WebElement loc = driver.findElement(By.id("location"));	
Select select = new Select(loc);
select.selectByIndex(3);
	
WebElement hot = driver.findElement(By.id("hotels"));	
Select select1 = new Select(hot);
select1.selectByIndex(3);
	
WebElement rt = driver.findElement(By.id("room_type"));	
Select select2 = new Select(rt);
select2.selectByIndex(3);
	
WebElement di = driver.findElement(By.id("datepick_in"));	
Select select3 = new Select(di);
di.clear();
select3.selectByVisibleText(s2);








}

}
