package week3day3;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;


public class Merge2 extends SeMethods {
	@Test(groups={"regression"},dependsOnGroups={"sanity"})
	public void merge() throws InterruptedException {

		
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
		
		WebElement merge = locateElement("link", "Merge Leads");
		click(merge);
		
		WebElement fromLead =locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(fromLead);
		
		switchToWindow(1);
		
		WebElement id = locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input");
		type(id, "10586");
		
		WebElement find1 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find1);
		
		Thread.sleep(3000);
		
		WebElement click1 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithoutSnap(click1);
		
		switchToWindow(0);
		
		WebElement toLead = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(toLead);
		
		switchToWindow(1);
		
		WebElement id1 = locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input");
		type(id1, "10588");
		
		WebElement find2 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find2);
		
		Thread.sleep(3000);
		
		WebElement click2 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithoutSnap(click2);
		
		switchToWindow(0);
		
		WebElement mer = locateElement("link", "Merge");
		clickWithoutSnap(mer);
		
		acceptAlert();
		
		closeAllBrowsers();
		

	}

}
