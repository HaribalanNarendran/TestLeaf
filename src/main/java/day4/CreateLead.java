package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen9.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
//		Enter the credentials
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
//		Goto CreateLead
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
//		Select word of mouth on source dropdown box
		WebElement dropdown1=driver.findElementByXPath("//*[@id='createLeadForm_dataSourceId']");
		Select source=new Select(dropdown1);
		source.selectByVisibleText("Word of Mouth");
		
//		List all the currencies
		WebElement dropdown2=driver.findElementByXPath("//*[@id='createLeadForm_currencyUomId']");
		Select preferredcurrencies=new Select(dropdown2);
		List<WebElement>allcurrency=preferredcurrencies.getOptions();
		System.out.println(allcurrency.size());
		for(WebElement currency:allcurrency)
		{
			System.out.println(currency.getText());
		}
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen10.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		driver.close();

	}

}
