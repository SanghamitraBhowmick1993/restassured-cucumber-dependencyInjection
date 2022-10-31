package AppHooks;

import java.io.IOException;

import java.util.Properties;


import org.testng.ITestResult;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class AppHooks {

	Properties prop;

//	@BeforeStep
//	public void setUpSparktest() {
//		ExtentTest test = ExtentManager.getInstance().createTest("api get call");
//		ExtentReport.setTest(test);
//	}
//
//	@AfterStep
//	public void SparktestResult() throws IOException {
//		ExtentReport.getTest().log(Status.PASS, "test case passed ");
////			String screenshotPath = Util.getScreenshot("testScreenshot" + countScreenshot + ".png");
////			System.out.println("path " + screenshotPath  + "count " + countScreenshot);
////			countScreenshot++;
//		/*
//		 * ExtentReport.getTest() .addScreenCaptureFromPath(screenshotPath)
//		 * .fail(MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build())
//		 * ;
//		 */
//		ExtentReport.getTest().pass("API call passed");
//
//	}
//
//	@After
//	public void sparkFlush() {
//		ExtentManager.getInstance().flush();
//	}
}
