package testCases;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Merge {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		SeMethods hb = new SeMethods();
		hb.startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement user = hb.locateElement("id", "username");
		hb.type(user, "DemoSalesManager");
		
		WebElement pwd = hb.locateElement("id", "password");
		hb.type(pwd, "crmsfa");
		
		WebElement login = hb.locateElement("class", "decorativeSubmit");
		hb.click(login);
		
		WebElement crm = hb.locateElement("link", "CRM/SFA");
		hb.click(crm);
		
		WebElement lead = hb.locateElement("link", "Leads");
		hb.click(lead);
		
		WebElement merge = hb.locateElement("link", "Merge Leads");
		hb.click(merge);
		
		WebElement fromLead =hb.locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		hb.click(fromLead);
		
		hb.switchToWindow(1);
		
		WebElement id = hb.locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input");
		hb.type(id, "10534");
		
		WebElement find1 = hb.locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		hb.click(find1);
		
		Thread.sleep(3000);
		
		WebElement click1 = hb.locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		hb.click(click1);
		
		hb.switchToWindow(0);
		
		WebElement toLead = hb.locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		hb.click(toLead);
		
		hb.switchToWindow(1);
		
		WebElement id1 = hb.locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input");
		hb.type(id1, "10535");
		
		WebElement find2 = hb.locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		hb.click(find2);
		
		Thread.sleep(3000);
		
		WebElement click2 = hb.locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		hb.click(click2);
		
		hb.switchToWindow(0);
		
		WebElement mer = hb.locateElement("link", "Merge");
		hb.click(mer);
		
		hb.acceptAlert();
		
		hb.closeAllBrowsers();
		

	}

}
