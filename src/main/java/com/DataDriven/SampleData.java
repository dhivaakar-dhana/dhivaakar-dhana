package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleData {
	public static void ReadAllData() throws Throwable {
		File f =new File("D:\\Maven_project\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet SheetOne = w.getSheetAt(0);
		
		int NumberOfRows = SheetOne.getPhysicalNumberOfRows();
		
		for (int i = 0; i < NumberOfRows; i++) {
			
			Row row = SheetOne.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < NumberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					int value = (int)numericCellValue;
					System.out.println(value);
				}	
			}	
		}
	
	}
	
	public static void main(String[] args) throws Throwable {
		ReadAllData();
	}

}
