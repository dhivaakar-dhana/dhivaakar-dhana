package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadRowData {
	
	public static void readRowData() throws Throwable {
		
		File f = new File("D:\\Maven_project\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i < physicalNumberOfCells; i++) {
			
			Cell cell = row.getCell(i);
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
	public static void ReadColumnData() throws Throwable {
		File f = new File("D:\\Maven_project\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRow = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRow; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
		}
		
		
		
	}
	public static void main(String[] args) throws Throwable {
		ReadColumnData();
	}

}
