package week2day3;


import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		
		int oFrame=driver.findElementsByTagName("iframe").size();
		System.out.println(oFrame);
		
		int iFrame = 0;
		
		for(int i=0; i<oFrame ; i++)
		{
			
			driver.switchTo().frame(i);	 
			
			int innerFrame =  driver.findElementsByTagName("iframe").size();
			
			System.out.println("Number of innerframes of frame " + (i + 1)  +" is " + innerFrame);				
			
			iFrame = iFrame + innerFrame;			

			driver.switchTo().defaultContent();
			
			//int innerFrame2 = driver.findElementsByTagName("iframe").size();
		}
		
		System.out.println("The Total outer frames are " + oFrame);
		System.out.println("The Total inner frames are " + iFrame);
		
		int TotalFrames = oFrame + iFrame;
		
		System.out.println("Total Frames are " + TotalFrames);

	}

}
