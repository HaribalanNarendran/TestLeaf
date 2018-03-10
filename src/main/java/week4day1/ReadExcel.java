package week4day1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.DATA_CONVERSION;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public String[][] readexcel() throws InvalidFormatException, IOException {
		
		File CreateLead = new File("./data/CreateLead.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(CreateLead);
		
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		int rowcount= sheet.getLastRowNum();
		System.out.println(rowcount);
		int cellcount =sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		
		String[][] data = new String[rowcount][cellcount];
		
		
		for (int i = 1; i <=rowcount ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <cellcount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				
				
		data[i-1][j]=cell.getStringCellValue();	
		
			}
		
		}
		wb.close();
		return data;
	
		
	}

}
