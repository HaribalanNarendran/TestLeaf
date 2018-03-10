package week3day4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Edit extends Annotations {
	
	@Test(dataProvider="fetch")
	public void edit(String first,String comp) throws InterruptedException
	{
		
		WebElement leads = locateElement("link", "Leads");
		click(leads);
		
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		WebElement firstname =locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstname, first);
		
		WebElement find = locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(find);
		
		Thread.sleep(3000);
		
		WebElement lead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(lead);
		
		verifyTitle("View Lead | opentaps CRM");
		
		WebElement edit = locateElement("link", "Edit");
		click(edit);
		
		WebElement value = locateElement("id", "updateLeadForm_companyName");
		type(value, comp);
		
		WebElement update = locateElement("xpath","(//input[@class='smallSubmit'])[1]");
		click(update);
		
		WebElement text1=locateElement("id", "viewLead_companyName_sp");
		verifyExactText(text1, "wipro");
		
		
}
		@DataProvider(name="fetch")
		public static Object[][] getdata() {
		Object[][] data = new Object[2][2];
		data[0][0] = "hb";
		data[0][1] = "wipro";
		data[1][0] = "hb";
		data[1][1] = "wipro";
		return data;

		}
}