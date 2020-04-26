package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet1=book.getSheet("Sheet1");
		
		sheet1.getRow(0).createCell(5).setCellValue("Country");
		sheet1.createRow(3).createCell(0).setCellValue("Hichem");
		
		Sheet customSheet=book.createSheet("TestSheet");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		book.write(fos);
		
	}

}
