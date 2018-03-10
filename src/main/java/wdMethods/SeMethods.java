package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver;
	int i;
	
	@Override
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("The browser " + browser + " is launched");
		} catch (WebDriverException e) {
			System.err.println("Browser is not launched");
		}finally{
			takeSnap();
		}

	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch(locator) {
			case "id": 
				ele = driver.findElementById(locValue); 
				break;
			case "link": 
				ele = driver.findElementByLinkText(locValue);
				break;
			case "xpath": 
				ele = driver.findElementByXPath(locValue);
				break;
			case "class": 
				ele = driver.findElementByClassName(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			}
			
		} catch (NoSuchElementException e) {
			System.err.println("The WebElement" +locator+ "could not be found");
			throw new RuntimeException();
//			e.printStackTrace();
		}finally{
			takeSnap();
		}
		return ele;
	}

	

	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text "+data + " is entered");
		} catch (WebDriverException e) {
			System.err.println("The Element"+data+"is not entered");
		}
	}

	@Override
	public void click(WebElement ele) {
		try {
			String text = ele.getText();
			ele.click();
			System.out.println("The element "+text+" is clicked");
		} catch (WebDriverException e) {
			System.err.println("Element is not clicked");
		}finally{
			takeSnap();
		}

	}

	@Override
	public void clickWithoutSnap(WebElement ele){
		try {
			String text1 = ele.getText();
			ele.click();
			System.out.println("The Element"+text1+"is clicked");
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public String getText(WebElement ele) {
		
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		
		Select text=new Select(ele);
		text.selectByVisibleText(value);

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if(title.equals(expectedTitle))
			System.out.println("verified sucessfully");
		else
			System.out.println("verification failed");
		//return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		String text=ele.getText();
		if(text.contains(expectedText))
		{
			System.out.println("verification success");
		}
		else
		{
			System.out.println("verification failed");
		}
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String>allwindows=driver.getWindowHandles();
		List<String>allWHandles=new ArrayList<String>();
		allWHandles.addAll(allwindows);
		String secondWindow=allWHandles.get(index);
		driver.switchTo().window(secondWindow);

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	@Override
	public String getAlertText() {
		driver.switchTo().alert().getText();
		return null;
	}

	@Override
	public long takeSnap() {
	 {
			File image=driver.getScreenshotAs(OutputType.FILE);
			File imagefile=new File("./screenshots/ss"+i+".png");
			try {
				FileUtils.copyFile(image, imagefile);
			} catch (IOException e) {
				//System.err.println("ss cannot be taken");
				e.printStackTrace();
			}
			
		} 
	 i++;
		return 0;
	}

	@Override
	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");

	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();

	}

}
