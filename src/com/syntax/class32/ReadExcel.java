package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\pfeif\\Documents\\Excel\\Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		//get an object of workbook type
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		System.out.println("-------------------");
		//need to find number of rows
		int rows=sheet.getPhysicalNumberOfRows();
		
		//find number of columns
		int cols=sheet.getRow(0).getLastCellNum();
		
		//get data from all the rows and all columns
		for(int r=0;r<rows;r++) {//iterate over rows
			for(int c=0;c<cols;c++) { //iterator columns
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println("");
		}
		
		
		
	}

}
