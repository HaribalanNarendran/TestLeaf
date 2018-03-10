package day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
//		File image=driver.getScreenshotAs(OutputType.FILE);
//		File imagefile=new File("./screenshots/screen5.png");
//		FileUtils.copyFile(image,imagefile );
//		Thread.sleep(3000);
		
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./screenshots/screen5.png"));
		
		
		
		String homepage=driver.getCurrentUrl();
		System.out.println("Before Login URL" + homepage);
		String loginTitle=driver.getTitle();
		System.out.println(loginTitle);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String welcome=driver.findElementByXPath("//*[@id='form']/h2").getText();
		System.out.println("Welcome Text:"+welcome);
		String loginpage=driver.getCurrentUrl();
		System.out.println("After Login:"+loginpage);
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		
		
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen6.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		driver.close();
		}
	}

