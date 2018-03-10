package week2day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//		Enter the credentials
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
//		Goto CreateLead
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
//		window handle
		String window=driver.getWindowHandle();
		System.out.println(window);
		

		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		System.out.println(driver.getTitle());
		
		Set<String>allwindows=driver.getWindowHandles();
		List<String>allWHandles=new ArrayList<String>();
		
		
		allWHandles.addAll(allwindows);
		
		String secondWindow=allWHandles.get(1);
		driver.switchTo().window(secondWindow);
		
		
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10289");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("10289").click();
		
		
		String firstWindow=allWHandles.get(0);
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
		
		
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		System.out.println(driver.getTitle());
		
		allwindows=driver.getWindowHandles();
		allWHandles=new ArrayList<String>();
		allWHandles.addAll(allwindows);
		secondWindow=allWHandles.get(1);
		
		
		
		driver.switchTo().window(secondWindow);
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10291");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("10291").click();
		
		driver.switchTo().window(firstWindow);
		driver.findElementByLinkText("Merge").click();
		
		driver.switchTo().alert().accept();
		

	}

}
