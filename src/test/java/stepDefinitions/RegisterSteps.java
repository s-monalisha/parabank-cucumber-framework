package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegisterSteps {
	WebDriver driver;
	RegisterPage registerPage;
	private static final Logger log = LogManager.getLogger(RegisterSteps.class);
	
	@Given("user is on the registration page")
	public void user_is_on_the_registration_page() {
		log.info("Navigating to registration page");
		driver = DriverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		registerPage.clkRegisterLnk();
	    
	}
	@When("user enters the registration details")
	public void user_enters_the_registration_details() {
		registerPage.fillRegistrationForm();
	    
	}
	@When("user clicks on the register button")
	public void user_clicks_on_the_register_button() {
		registerPage.clkRegisterbtn();
		log.info("register button clicked");
	    
	}
	@Then("user should see account created message")
	public void user_should_see_account_created_message() {
	    System.out.println("Registration executed");
	    
	}


}
