package week3day1;


import org.junit.Test;
import org.openqa.selenium.WebElement;


import wdMethods.SeMethods;


public class Delete1 extends SeMethods {
	@Test
	public  void delete() throws InterruptedException {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement user = locateElement("id", "username");
		type(user, "DemoSalesManager");
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);
		
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		WebElement phone = locateElement("link", "Phone");
		click(phone);
		
		WebElement code = locateElement("xpath", "//*[@id='ext-gen262']");
		type(code, "91");
		
		WebElement num = locateElement("xpath", "//*[@id='ext-gen270']");
		type(num, "9876543210");
		
		
		WebElement find = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find);
		
		Thread.sleep(3000);
		
		WebElement click = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(click);
		
		WebElement dele = locateElement("link", "Delete");
		click(dele);
		
		closeBrowser();


	}

}
