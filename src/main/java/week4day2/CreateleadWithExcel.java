package week4day2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week3day4.Annotations;
import week4day1.ReadExcel;

public class CreateleadWithExcel extends Annotations {
	@Test(dataProvider="fetchData")
	public  void login1(String com,String first,String last) {
		
		
		
		
		WebElement createLead=locateElement("link", "Create Lead");
		click(createLead);
		
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, com);
		
		WebElement firstName = locateElement("id", "createLeadForm_firstName");
		type(firstName, first);
		
		WebElement lastName=locateElement("id", "createLeadForm_lastName");
		type(lastName, last);
		
		WebElement create=locateElement("class", "smallSubmit");
		click(create);
	}
		
		/*@DataProvider(name = "fetchData")
		public static Object[][] getData() {
			Object[][] data = new Object[2][3];
			data[0][0] = "Test";
			data[0][1] = "Muthu";
			data[0][2] = "kumar";
			data[1][0] = "leaf";
			data[1][1] = "kumar";
			data[1][2] = "bro";
			return data;	
		*/
	@DataProvider(name = "fetchData")
	public static String[][] getData() throws InvalidFormatException, IOException {
	ReadExcel dp = new ReadExcel();
	String[][] excel= dp.readexcel();
	return excel;
	
	}
	
		
	}


