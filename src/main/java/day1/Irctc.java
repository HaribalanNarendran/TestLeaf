package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
//		Taking SS
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("Haribala77");
		driver.findElementById("userRegistrationForm:checkavail").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Hariapple24");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Hariapple24");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Thalaivar");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Hari");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Balan");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("24");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("APR");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1996");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("SelfEmployed");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123412341234");
		driver.findElementById("userRegistrationForm:idno").sendKeys("0123456789");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("haribalannarendran@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9500001608");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("NO:12");
		driver.findElementById("userRegistrationForm:street").sendKeys("Singari street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Mylapore");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600004",Keys.TAB);
		
//		Taking SS
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen1.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
