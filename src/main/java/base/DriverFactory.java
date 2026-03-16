package base;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
//	public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public Properties prop;
	private static final Logger log = LogManager.getLogger(DriverFactory.class);
	
	public WebDriver init_driver() {
		log.info("Initialising Web Browser");
	  prop = ConfigReader.init_prop();
	  String browser = prop.getProperty("browser");
	  if(browser.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();
		  driver.set(new ChromeDriver());
	  }
	  
	  getDriver().manage().window().maximize();
	  getDriver().get(prop.getProperty("url"));
	  log.info("Navigated to URL: " + prop.getProperty("url"));
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return driver.get();
	}

}
