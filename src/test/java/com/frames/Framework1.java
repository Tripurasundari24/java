package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Framework1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");

WebElement insert = driver.findElement(By.id("username"));
insert.sendKeys("greens");
WebElement insert1 = driver.findElement(By.id("password"));
insert1.sendKeys("pass");
WebElement btn = driver.findElement(By.id("login"));
btn.click();



}
}