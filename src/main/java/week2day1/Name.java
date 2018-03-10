package week2day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		
//		Chrome Browser
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
//		Launch the Application
		driver.get("https://www.google.co.in/");
		
//		File image=driver.getScreenshotAs(OutputType.FILE);
//		File imagefile=new File("./screenshots/screen17.png");
//		FileUtils.copyFile(image, imagefile);
//		Thread.sleep(3000);
//		
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./screenshots/screen17.png"));
		
		driver.findElementById("lst-ib").sendKeys("Haribalan",Keys.ENTER);
		
		
//		all the links
//		List<WebElement>atag=driver.findElementsByTagName("a");
//		for(WebElement each:atag)
//		{
//			if(each.getText().toLowerCase().contains("Haribalan"))
//			System.out.println(each.getText());
//		}
		
		
		
//		alternative Method
		List<WebElement>list=driver.findElementsByPartialLinkText("Haribalan");
		for(WebElement link:list)
			
		{
			System.out.println(link.getText());
		}

		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen18.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
