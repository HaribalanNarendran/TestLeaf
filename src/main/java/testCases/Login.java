package testCases;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login {
	
	
	public static void main(String[] args) {
		
		SeMethods se = new SeMethods();
		se.startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement user = se.locateElement("id", "username");
		se.type(user, "DemoSalesManager");
		
		WebElement pwd = se.locateElement("id", "password");
		se.type(pwd, "crmsfa");
		
		WebElement login = se.locateElement("class", "decorativeSubmit");
		se.click(login);
		
		WebElement crm = se.locateElement("link", "CRM/SFA");
		se.click(crm);
		
		WebElement createLead=se.locateElement("link", "Create Lead");
		se.click(createLead);
		
		WebElement companyName = se.locateElement("id", "createLeadForm_companyName");
		se.type(companyName, "Amazon");
		
		WebElement firstName = se.locateElement("id", "createLeadForm_firstName");
		se.type(firstName, "Hari");
		
		WebElement source = se.locateElement("xpath", "//*[@id='createLeadForm_dataSourceId']");
		se.selectDropDownUsingText(source, "Word of Mouth");
		
		WebElement lastName=se.locateElement("id", "createLeadForm_lastName");
		se.type(lastName, "Balan");
		
		WebElement create=se.locateElement("class", "smallSubmit");
		se.click(create);
		
		
		
		
		se.closeBrowser();
		
		
		
		
		
		
		
	}

}
