package reports;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Sample {
	@Test
	public void report() {
		//Create HTML
		ExtentReports reports = new ExtentReports("./reports/report1.html",false);
		File name=new File("./Extent.xml");
		reports.loadConfig(name);
		ExtentTest test =reports.startTest("Sample");
		test.assignAuthor("Hari");
		test.assignCategory("smoke");
		test.log(LogStatus.PASS, "passed");
		test.log(LogStatus.FAIL, "Failed");
		test.log(LogStatus.WARNING, "Warning");
		reports.endTest(test);
		//Save
		reports.flush();
		
	}
	

}
