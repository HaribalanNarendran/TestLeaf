package day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen7.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("//*[@id='username']").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String welcomeMessage=driver.findElementByXPath("//*[@id='form']/h2").getText();
		System.out.println("Found the Following"+welcomeMessage);
		if(welcomeMessage.contains("Demo B2B CSR"))
{
	System.out.println("pass");
}
else
{
	System.out.println("Fail");
}
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen8.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
