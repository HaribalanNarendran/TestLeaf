package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		System.out.println("Opentaps app is launched");
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen2.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoCSR");
		System.out.println("id is entered");
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("password is entered");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("login sucessfull");
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("clicked sucessfully");
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen3.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		
		driver.close();
		System.out.println("Execution is successful and Browser is closed");
		
		// TODO Auto-generated method stub

	}

}
