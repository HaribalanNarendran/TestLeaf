package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
//		Launch the application
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		
		File image=driver.getScreenshotAs(OutputType.FILE);
		File imagefile=new File("./screenshots/screen13.png");
		FileUtils.copyFile(image, imagefile);
		Thread.sleep(3000);
		
//		List the Security question dropdown box
		WebElement dropdown1 =driver.findElementById("userRegistrationForm:securityQ");
		Select securityquestion=new Select(dropdown1);
		List<WebElement>questions=securityquestion.getOptions();
		for(WebElement each1:questions)
		{
			System.out.println(each1.getText());
		}
		
//		List the preferred languages
		WebElement dropdown2=driver.findElementById("userRegistrationForm:prelan");
		Select prefferedlanguages=new Select(dropdown2);
		List<WebElement>languages=prefferedlanguages.getOptions();
		for(WebElement each2:languages){
			System.out.println(each2.getText());
		}
		
		
//		List the date in D.O.B
		WebElement dropdown3=driver.findElementById("userRegistrationForm:dobDay");
		Select datelist=new Select(dropdown3);
		List<WebElement>date=datelist.getOptions();
		for(WebElement each3:date)
		{
			System.out.println(each3.getText());
		}
		
		
//		List the month in D.O.B
		WebElement dropdown4=driver.findElementById("userRegistrationForm:dobMonth");
		Select monthlist=new Select(dropdown4);
		List<WebElement>month=monthlist.getOptions();
		for(WebElement each4:month)
		{
			System.out.println(each4.getText());
		}
		
//		List the year in D.O.B
		WebElement dropdown5=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yearlist=new Select(dropdown5);
		List<WebElement>year=yearlist.getOptions();
		for(WebElement each5:year)
		{
			System.out.println(each5.getText());
		}
		
		
		
//		occupation
		WebElement dropdown6=driver.findElementById("userRegistrationForm:occupation");
		Select ocupationlist=new Select(dropdown6);
		List<WebElement>ocupation=ocupationlist.getOptions();
		for(WebElement each6:ocupation)
		{
			System.out.println(each6.getText());
		}
		
		
		
//		credentials
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123412341234");
		driver.findElementById("userRegistrationForm:idno").sendKeys("0123456789");
		
		
//		countries
		WebElement dropdown7=driver.findElementById("userRegistrationForm:countries");
		Select countrylist=new Select(dropdown7);
		List<WebElement>country=countrylist.getOptions();
		System.out.println(country.size());
		for(WebElement each7:country)
		{
			System.out.println(each7.getText());
		}
		countrylist.selectByVisibleText("India");
		
		
//		credentials
		driver.findElementById("userRegistrationForm:email").sendKeys("haribalannarendran@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9500001608");
		
		
//		Nationality
		WebElement dropdown8=driver.findElementById("userRegistrationForm:nationalityId");
		Select nationlist=new Select(dropdown8);
		List<WebElement>nation=nationlist.getOptions();
		System.out.println(nation.size());
		for(WebElement each8:nation)
		{
			System.out.println(each8.getText());
		}
		nationlist.selectByVisibleText("India");
		
		
		
//		credentials
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("NO:12");
		driver.findElementById("userRegistrationForm:street").sendKeys("Singari street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Mylapore");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600004",Keys.TAB);
		
		Thread.sleep(5000);
		
		
//		city
		WebElement dropdown9=driver.findElementById("userRegistrationForm:cityName");
		Select citylist=new Select(dropdown9);
		List<WebElement>city=citylist.getOptions();
		System.out.println(city.size());
		for(WebElement each9:city)
		{
			System.out.println(each9.getText());
		}
		citylist.selectByVisibleText("Chennai");
		
		
		
//		Postoffice
//		WebElement dropdown10=driver.findElementByXPath("//*[@id='userRegistrationForm:postofficeName']");
//		Select polist=new Select(dropdown10);
//		List<WebElement>po=polist.getOptions();
//		System.out.println(po.size());
//		for(WebElement each10:po)
//		{
//			System.out.println(each10.getText());
//		}
//		polist.selectByVisibleText("MylaporeH.O");
		
		File image1=driver.getScreenshotAs(OutputType.FILE);
		File imagefile1=new File("./screenshots/screen14.png");
		FileUtils.copyFile(image1, imagefile1);
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		

	}
	

}
