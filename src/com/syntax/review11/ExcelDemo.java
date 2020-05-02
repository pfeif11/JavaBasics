package com.syntax.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		String filePath=System.getProperty("user.dir")+"\\testdata\\Excel.xlsx";
		System.out.println(filePath);
		FileInputStream fileIS=new FileInputStream(filePath);
		Workbook book=new XSSFWorkbook(fileIS);
		Sheet sheet=book.getSheet("Sheet1");
		
		Row header=sheet.getRow(0);
		
		}
}
