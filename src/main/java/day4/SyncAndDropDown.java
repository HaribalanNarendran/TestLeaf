package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SyncAndDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen15.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
		
		WebElement dropDown=driver.findElementById("userRegistrationForm:securityQ");
		Select securityQuestion = new Select(dropDown);
		List<WebElement>question =securityQuestion.getOptions();
		System.out.println(question.size());
		for(WebElement each:question)
		{
			System.out.println(each.getText());
		}
       securityQuestion.selectByVisibleText("What is your all time favorite sports team?");
       
       File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen16.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
