package week3day3;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login2 extends SeMethods{
		@Test(groups={"smoke"})
		public  void login1() {
			
			
			startApp("chrome", "http://leaftaps.com/opentaps");
			
			WebElement user = locateElement("id", "username");
			type(user, "DemoSalesManager");
			
			WebElement pwd = locateElement("id", "password");
			type(pwd, "crmsfa");
			
			WebElement login = locateElement("class", "decorativeSubmit");
			click(login);
			
			WebElement crm = locateElement("link", "CRM/SFA");
			click(crm);
			
			WebElement createLead=locateElement("link", "Create Lead");
			click(createLead);
			
			WebElement companyName = locateElement("id", "createLeadForm_companyName");
			type(companyName, "Amazon");
			
			WebElement firstName = locateElement("id", "createLeadForm_firstName");
			type(firstName, "Hb");
			
			WebElement source = locateElement("xpath", "//*[@id='createLeadForm_dataSourceId']");
			selectDropDownUsingText(source, "Word of Mouth");
			
			WebElement lastName=locateElement("id", "createLeadForm_lastName");
			type(lastName, "vr");
			
			WebElement create=locateElement("class", "smallSubmit");
			click(create);
			
			
			
			
			closeBrowser();
			
			
			
			
			
			
			
		}

	}



