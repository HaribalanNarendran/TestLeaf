package day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgotpassword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		chrome browser is launched
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is Launched");
		
//		window is maximized
		driver.manage().window().maximize();
		System.out.println("Window is Maximized");
		
//		Launching the application
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen4.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
		
//		Enter wrong credentials
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("hari");
		driver.findElementByXPath("//*[@id='login']/p[3]/input").click();
		
		
//		To Check username on forgot password is displayed or not?
//		boolean display=driver.findElementByXPath("//*[@id='forgotpasswd']").isDisplayed();
//		if(display)
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
//		driver.findElementByXPath("//*[@id='form']/h3/a").click();
//		boolean display1=driver.findElementByXPath("//*[@id='forgotpasswd']").isDisplayed();
//		if(display1)
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("False");
//		}
//		
//		File image1=driver.getScreenshotAs(OutputType.FILE);
//		File imagefile1=new File("./screenshots/screen5.png");
//		FileUtils.copyFile(image1, imagefile1);
//		Thread.sleep(3000);
//		
		driver.close();
		
//		Forgot your password
//		driver.findElementByLinkText("Forgot Your Password?").click();
//		driver.findElementByXPath("(//*[@id='username'])[2]").sendKeys("DemoCSR");
		
		
		// TODO Auto-generated method stub

	}

}
