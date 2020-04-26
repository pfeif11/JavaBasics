package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	public static void main(String[] args) throws IOException {
		String filePath="C:/Users/pfeif/Documents/Excel/Test.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet2");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++) {
			for(int c=0;c<cols;c++) {
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
