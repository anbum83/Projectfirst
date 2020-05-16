package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\MavenSample\\Browser\\chromedriver.exe");
		
		File f=new File("C:\\Users\\Welcome\\eclipse-workspace\\MavenSample\\Collegedetails\\Data.xlsx");
		
		FileInputStream stream=new FileInputStream (f);
		
		//workbook
		
		Workbook w=new XSSFWorkbook(stream);
		
		//sheet
		
		Sheet s = w.getSheet("Details");
		
		//to get all the values from the Details sheet
		
		for (int i=0; i<s.getPhysicalNumberOfRows();i++)
		{
			
			Row row = s.getRow(i);
			
			for(int j=0; j<row.getPhysicalNumberOfCells();j++)
			{
				
				Cell c = row.getCell(j);
				
				int type = c.getCellType();
				
				//type 1===string
				//type 0===number/date
				
				if(type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
					
					}
				else if (type==0){
					//date
					if(DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						
						SimpleDateFormat sf=new SimpleDateFormat("dd-M-yyyy");
						
						String str = sf.format(d);
						System.out.println(str);
					}else
					{
						//number
						double value = c.getNumericCellValue();
						
						//type casting
						
						long ln= (long)value;
						
						String num = String.valueOf(ln);
						
						//String no = String.valueOf(value);
						//System.out.println(no);
						System.out.println(num);
						
					}
						
					}
					
					
				}
				
				
				
			}
			
			
			
		}
		
}
