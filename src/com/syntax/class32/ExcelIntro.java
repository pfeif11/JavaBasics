package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\pfeif\\Documents\\Excel\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		//accesing workbook
		Workbook wbook=new XSSFWorkbook(fis); //used to work with excel files
		//accessing sheet
		Sheet sheet=wbook.getSheet("Sheet1");
		//accessing row
		Row row1=sheet.getRow(0);
		//accessing cell
		Cell cell=row1.getCell(1);
		//get value from cell
		String r1c2=cell.toString();
		System.out.println(r1c2); //lastName
		//how to get New York
		Row row3=sheet.getRow(2);
		Cell r3c3=row3.getCell(2);
		String cellValue=r3c3.toString();
		System.out.println(cellValue);
		//access VA method chaining
		cellValue=sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		//to retrieve calues based on type
		double cellValue1=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellValue1);
		
		//how to get 20151 in a String format
		String valC=sheet.getRow(1).getCell(4).toString();
			System.out.println(valC.replace(".0", ""));
		String[] arr=valC.split("\\.");
		System.out.println(arr[0]);
		
		
		
		
		
		
		
		
		
		
	
	}

}
