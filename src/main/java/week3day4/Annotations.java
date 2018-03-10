package week3day4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class Annotations extends SeMethods{
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@BeforeTest
public void beforeTest() {
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
	}
	
	@Parameters({"browser","url","user","pwd"})
	@BeforeMethod
	public void beforeMethod(String browser,String url,String user1,String pwd1) {
		

		startApp(browser, url);
		
		WebElement user = locateElement("id", "username");
		type(user, user1);
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, pwd1);
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);
		
	
	}
	
	@AfterMethod
	public void afterMethod() {
		
		closeBrowser();
		
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	
	@AfterTest
	public void afterTest() {
			
		}
		
	@AfterSuite
	public void afterSuite() {
		
	}
	
	

}
