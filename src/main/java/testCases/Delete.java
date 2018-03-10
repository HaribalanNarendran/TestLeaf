package testCases;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Delete {

	public static void main(String[] args) throws InterruptedException {
		SeMethods vr = new SeMethods();
		vr.startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement user = vr.locateElement("id", "username");
		vr.type(user, "DemoSalesManager");
		
		WebElement pwd = vr.locateElement("id", "password");
		vr.type(pwd, "crmsfa");
		
		WebElement login = vr.locateElement("class", "decorativeSubmit");
		vr.click(login);
		
		WebElement crm = vr.locateElement("link", "CRM/SFA");
		vr.click(crm);
		
		WebElement lead = vr.locateElement("link", "Leads");
		vr.click(lead);
		
		WebElement findLead = vr.locateElement("link", "Find Leads");
		vr.click(findLead);
		
		WebElement phone = vr.locateElement("link", "Phone");
		vr.click(phone);
		
		WebElement code = vr.locateElement("xpath", "//*[@id='ext-gen262']");
		vr.type(code, "91");
		
		WebElement num = vr.locateElement("xpath", "//*[@id='ext-gen270']");
		vr.type(num, "9876543210");
		
		
		WebElement find = vr.locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		vr.click(find);
		
		Thread.sleep(3000);
		
		WebElement click = vr.locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		vr.click(click);
		
		WebElement dele = vr.locateElement("link", "Delete");
		vr.click(dele);
		
		vr.closeBrowser();

	}

}
