package week3day4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Duplicate extends Annotations {
	@Test()
	public void duplicate(){
		
		
		WebElement lead = locateElement("xpath", "//a[text()='Leads']");
		click(lead);
		
		WebElement findlead = locateElement("xpath", "//a[text()='Find Leads']");
		click(findlead);
		
		WebElement firstname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstname , "hb");
		
		WebElement findleads = locateElement("xpath", "//button[text()='Find Leads']");
		click(findleads);
		
		WebElement firstlink = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(firstlink);
		
		verifyTitle("View Lead | opentaps CRM");
		
		WebElement edit = locateElement("xpath", "//a[text()='Edit']");
		click(edit);
		
		WebElement comp = locateElement("id", "updateLeadForm_companyName");
		type(comp,"wipro");
		
		WebElement update = locateElement("xpath", "//input[@value='Update']");
		click(update);
		
		
	}
	
	

}
