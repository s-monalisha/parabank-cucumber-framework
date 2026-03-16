package hooks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ExtentManager;
import utilities.ExtentTestManager;
import utilities.ScreenshotUtil;

public class AppHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	ExtentReports extent;
	
	@Before
	public void setup(Scenario scenario) {
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver();
		
		extent = ExtentManager.getReporter();
		ExtentTest test = extent.createTest(scenario.getName());
		ExtentTestManager.setTest(test);
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String path = ScreenshotUtil.captureScreenshot(driver, scenario.getName());
			 ExtentTestManager.getTest().fail("Test Failed")
             .addScreenCaptureFromPath(path);

                }
		else {

     ExtentTestManager.getTest().pass("Test Passed");

             }
		extent.flush();
		driver.quit();
	}
}
