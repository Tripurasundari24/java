package com.frames;

import java.io.File;
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

public class Automotion {
	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
 List<WebElement> countries = driver.findElements(By.id("countries"));
File file = new File("C:\\Users\\ROOFANDFLOOR\\eclipse-workspace\\Maven\\Excellsheet\\excells.xlsx");
Workbook workbook = new XSSFWorkbook();


Sheet createSheet = workbook.createSheet("sheet3");

for (int i = 0; i < countries.size(); i++) {
	WebElement element = countries.get(i);
	String text = element.getText();
	System.out.println(text);
	
	Row createRow = createSheet.createRow(i);
	
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue(text);
}
FileOutputStream stream2 =new FileOutputStream(file);

workbook.write(stream2);
	}



}








