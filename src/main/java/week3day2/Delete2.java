package week3day2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;


public class Delete2 extends SeMethods {
	@Test(dependsOnMethods={"week3day2.Login2.login1"})
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
		type(num, "9876543211");
		
		
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