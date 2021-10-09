package com.frames;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
		public static void main(String[] args) throws IOException {
			WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("iphone");
    
    WebElement enter = driver.findElement(By.id("nav-search-submit-button"));
	enter.click();
	
	
	List<WebElement> text = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
   File file = new File ("C:\\Users\\ROOFANDFLOOR\\eclipse-workspace\\Maven\\Excellsheet\\excells.xlsx");
	Workbook workbook = new XSSFWorkbook();
	
	Sheet createSheet = workbook.createSheet("sheet2");
	
	for (int i = 0; i < text.size(); i++) {
		
		WebElement webElement = text.get(i);
		String text1 = webElement.getText();
		System.out.println(text1);
		
		Row createRow = createSheet.createRow(i);
	
	Cell createCell = createRow.createCell(0);
	
	 createCell.setCellValue(text1);

	}
	
	FileOutputStream stream2 =new FileOutputStream(file);
	
	workbook.write(stream2);
	
	}
		}


