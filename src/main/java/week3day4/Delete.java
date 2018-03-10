package week3day4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Delete extends Annotations {
	@Test(dataProvider="fetch")
	public  void delete(String cod,String numb) throws InterruptedException {
		
		
		
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		WebElement phone = locateElement("link", "Phone");
		click(phone);
		
		WebElement code = locateElement("xpath", "//*[@id='ext-gen262']");
		type(code, cod);
		
		WebElement num = locateElement("xpath", "//*[@id='ext-gen270']");
		type(num, numb);
		
		
		WebElement find = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find);
		
		Thread.sleep(3000);
		
		WebElement click = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(click);
		
		WebElement dele = locateElement("link", "Delete");
		click(dele);
		
		
			
		}
	@DataProvider(name="fetch") 
	public static Object[][] getData(){
	Object[][] data = new Object[2][2];
	data[0][0] = "91";
	data[0][1] = "9638527410";
	data[1][0] = "91";
	data[1][1] = "9638527410";
	return data;


	}


		
	}
