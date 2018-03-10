package week3day1;




import org.junit.Test;
import org.openqa.selenium.WebElement;


import wdMethods.SeMethods;

public class Login1 extends SeMethods{
		@Test
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
			type(firstName, "Hari");
			
			WebElement source = locateElement("xpath", "//*[@id='createLeadForm_dataSourceId']");
			selectDropDownUsingText(source, "Word of Mouth");
			
			WebElement lastName=locateElement("id", "createLeadForm_lastName");
			type(lastName, "Balan");
			
			WebElement create=locateElement("class", "smallSubmit");
			click(create);
			
			
			
			
			closeBrowser();
			
			
			
			
			
			
			
		}

	}

