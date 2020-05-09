package com.syntax.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
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
		
		//get the whole file
		Workbook book=new XSSFWorkbook(fileIS);
		//get the sheet from the file
		Sheet sheet=book.getSheet("Sheet1");
		
		//get the number of rows in the current sheet, that has data
		int rows=sheet.getPhysicalNumberOfRows(); // gives us up to the last row that has data
		System.out.println("Number of rows:"+rows);
		//get one row from the current sheet
		Row row0=sheet.getRow(0);
		//get the number of cells in the current row (number of columns)
		int cells=row0.getLastCellNum();
		System.out.println("Number of columns:"+cells);
		
		//Let's loop the cells of the header
		System.out.println("-----Header--------");
		for(int i=0;i<cells;i++) {
			String data=row0.getCell(i).toString();
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("-------Let's get all data rows(except header)----------");
		
		for(int row=1;row<rows;row++) {
			//for every row, I will iterate the cells
			//Let's get the row
			Row curRow=sheet.getRow(row);
			
			//How many cells there are in the current row?
			int curCells=curRow.getLastCellNum();
			for(int cell=0;cell<curCells;cell++) {
				Cell cellData=curRow.getCell(cell);
				String cellStringData=cellData.toString();
				System.out.print(cellStringData+" ");
			}
			System.out.println();
		}
		
	
		
		
		
		
		
		
			}
		}
		
		
	

