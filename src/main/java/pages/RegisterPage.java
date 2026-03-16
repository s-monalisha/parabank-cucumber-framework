package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(RegisterPage.class);
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText= "Register")
	WebElement registerlnk;
	
	@FindBy(css="input#customer\\.firstName")
	WebElement firstname;
	
	@FindBy(css="input#customer\\.lastName")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement city;
	
	@FindBy(name="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phone;
	
	@FindBy(name="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement username;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(css="input#repeatedPassword")
	WebElement confirm;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerbtn;
	
	public void clkRegisterLnk() {
		registerlnk.click();
	}
	
	public void fillRegistrationForm() {
		log.info("Filling Registration Form");
		firstname.sendKeys("Jhon");
		lastname.sendKeys("Smith");
		address.sendKeys("Street 1");
		city.sendKeys("New York");
		state.sendKeys("NY");
		zipcode.sendKeys("10001");
		phone.sendKeys("1234567890");
		ssn.sendKeys("1234");
		username.sendKeys("john123");
		password.sendKeys("demo");
		confirm.sendKeys("demo");
		
	}
	
	public void  clkRegisterbtn() {
		registerbtn.click();
	}
	

}
