package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
//		Launch the application
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen11.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
//		Enter the credentials
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
//	    FindLead
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementById("ext-gen248").sendKeys("Ateet");
		driver.findElementById("ext-gen334").click();
		
		
		
		Thread.sleep(3000);
		driver.findElementByLinkText("10275").click();
		
		
//		WebElement name=driver.findElementById("viewLead_companyName_sp");
//		System.out.println(name.getText());

		String name=driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(name);
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen12.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		driver.close();
	}

}
