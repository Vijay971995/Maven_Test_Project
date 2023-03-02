package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenRead {
	public static void particularData() throws IOException  {
		File V = new File("E:\\Excel\\DataDrivenSample.xlsx");
		FileInputStream S = new FileInputStream(V);
		Workbook VS = new XSSFWorkbook(S);
		Sheet sheet = VS.getSheet("Details");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
		}
public static void allData()throws IOException  {
		File V = new File("E:\\Excel\\DataDrivenSample.xlsx");
		FileInputStream S = new FileInputStream(V);
		Workbook VS = new XSSFWorkbook(S);
		Sheet sheet = VS.getSheet("Details");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("The Number of Rows Is : "+physicalNumberOfRows);
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			System.out.println("The Number of Cells Is : "+physicalNumberOfCells);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
				}	
			}
		}
}	
		
public static void main(String[] args) throws IOException {
		allData();
		}
	}
