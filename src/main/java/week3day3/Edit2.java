package week3day3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Edit2 extends SeMethods {
	@Test(groups={"sanity"},dependsOnGroups={"smoke"})
	public void edit() throws InterruptedException
	{
		startApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		
		WebElement id = locateElement("id", "username");
		type(id, "DemoSalesManager");
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);
		
		WebElement leads = locateElement("link", "Leads");
		click(leads);
		
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		WebElement firstname =locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstname, "hb");
		
		WebElement find = locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(find);
		
		Thread.sleep(3000);
		
		WebElement lead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(lead);
		
		verifyTitle("View Lead | opentaps CRM");
		
		WebElement edit = locateElement("link", "Edit");
		click(edit);
		
		WebElement value = locateElement("id", "updateLeadForm_companyName");
		type(value, "syntel");
		
		WebElement update = locateElement("xpath","(//input[@class='smallSubmit'])[1]");
		click(update);
		
		WebElement text1=locateElement("id", "viewLead_companyName_sp");
		verifyExactText(text1, "syntel");
		
		closeBrowser();
}

}