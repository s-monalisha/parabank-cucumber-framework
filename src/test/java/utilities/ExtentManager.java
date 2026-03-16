package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReporter() {
		if(extent == null) {
			String path = System.getProperty("user.dir")+ "/reports/extentReport.html";
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("ParaBank Automation Result");
			reporter.config().setDocumentTitle("Test Execution Report");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Automation Engineer");
			extent.setSystemInfo("Environment", "QA");
		}
		return extent;
	}

}
