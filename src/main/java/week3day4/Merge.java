package week3day4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class Merge extends Annotations {
	@Test()
	public void merge() throws InterruptedException {

		
		
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		
		WebElement merge = locateElement("link", "Merge Leads");
		click(merge);
		
		WebElement fromLead =locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(fromLead);
		
		switchToWindow(1);
		
		WebElement id = locateElement("xpath", "//label[contains(text(),'First name:')]/following::input");
		type(id, "hb");
		
		WebElement find1 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find1);
		
		Thread.sleep(3000);
		
		WebElement click1 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithoutSnap(click1);
		
		switchToWindow(0);
		
		WebElement toLead = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(toLead);
		
		switchToWindow(1);
		
		WebElement id1 = locateElement("xpath", "//label[contains(text(),'First name:')]/following::input");
		type(id1, "hb" );
		
		WebElement find2 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find2);
		
		Thread.sleep(3000);
		
		WebElement click2 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");
		clickWithoutSnap(click2);
		
		switchToWindow(0);
		
		WebElement mer = locateElement("link", "Merge");
		clickWithoutSnap(mer);
		
		acceptAlert();
		
		
		

	}

}
