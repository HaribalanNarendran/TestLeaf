package week2day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learningFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		driver.switchTo().frame("iframeResult");
		
		
		
		
		
		WebElement dropdown=driver.findElementByXPath("/html/body/select");
		Select options=new Select(dropdown);
		
//		List<WebElement>option=options.getOptions();
		options.selectByVisibleText("Audi");
		
		driver.switchTo().defaultContent();
		
		
		driver.findElementByXPath("//*[@id='tryhome']").click();
		
		driver.quit();

	}

}
