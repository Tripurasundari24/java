package com.frames;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excells {
	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\ROOFANDFLOOR\\eclipse-workspace\\Maven\\Excellsheet\\Book1.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
			
			int type = cell.getCellType();
			if (type==1) {
				String name = cell.getStringCellValue();
				System.out.println(name);
			}
			if (type==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
					String name = dateformat.format(date);
					System.out.println(name);
				}else {
				
				
				
				
				double d = cell.getNumericCellValue();
			
				long l = (long)d;
				String name = String.valueOf(l);
				
				System.out.println(name);
			}
		
					
				}
				
			}
		}
				
			}
			
				
			
				
			
			
		
		
		}
	

