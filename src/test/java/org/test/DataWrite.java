package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Welcome\\eclipse-workspace\\MavenSample\\Collegedetails\\Data.xlsx");
		
		Workbook w= new XSSFWorkbook();
		
		// create new sheet
		Sheet s = w.createSheet("Sheet1");
		
		//create new row
		Row row = s.createRow(0);
		Row row1=s.createRow(1);
		
		//create new cell
		Cell c = row.createCell(0);
		Cell c1=row1.createCell(0);
		
		//set the value to the cell
		c.setCellValue("Anbu");
		c1.setCellValue("wELCOME");;
		
		//Need to write the value into the cell
		FileOutputStream os=new FileOutputStream(f);
		w.write(os);
		System.out.println("Done");
		
		
		//TO UPDATE THE VALUE IN THE EXISTING CELL
		
		FileInputStream f1=new FileInputStream(f);
		
		Workbook w1=new XSSFWorkbook(f1);
		
		//to get the sheet
		Sheet s1 = w1.getSheet("Sheet1");
		
		//to get the row
		Row row2 = s1.getRow(1);
		
		//to get the cell
		Cell c2 = row2.getCell(0);
		
		//to get the cell type
		int type = c2.getCellType();
		
		//type 1===String
		//type 0===Number or Date
		
		if (type==1) {
			
			String str = c2.getStringCellValue();
			
			if (str.equals("wELCOME")){
				c2.setCellValue("Munusamy");
			
		} else {
			System.out.println("Not a String Value");}
		
		
			FileOutputStream outpt=new FileOutputStream(f);
			
			w1.write(outpt);
			System.out.println("Updated");
			
			
			
		}
		
		
		
	}

}
