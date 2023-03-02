package com.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.BaseClasses.BaseClass;

public class Download extends BaseClass{
public static void main(String[] args) throws Exception {
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
				browserLaunch("chrome");
				getURL("https://www.youtube.com/watch?v=H-NPcPeA3mU");
				findElementWithNameandSendKeys("url", stringCellValue);
				findElementWithIDandClick("search");
				driver.findElement(By.xpath("\\html/body/main/section[1]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/table/tr[3]/td[2]"));
								
				
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
			}	
		}
	}
}
}
