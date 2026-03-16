package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TransferFundsPage;

public class TransferFundsSteps {
	WebDriver driver;
	LoginPage lp;
	TransferFundsPage transferPage;
	
	@Given("user logs into the application")
	public void user_logs_into_the_application() {
	    driver = DriverFactory.getDriver();
	    lp = new LoginPage(driver);
	    lp.enterUsername("john");
	    lp.enterPassword("demo");
	    lp.clkLoginbtn();
	    
	}
	@When("user navigates to the transfer fund page")
	public void user_navigates_to_the_transfer_fund_page() {
		transferPage = new TransferFundsPage(driver);
		transferPage.clkTransferlnk();
	    
	}
	@When("user enters transfer amount")
	public void user_enters_transfer_amount() {
		transferPage.enterAmount();
	    
	}
	@When("user submits the transfer")
	public void user_submits_the_transfer() {
		transferPage.clkTransferBtn();
	    
	}
	@Then("transfer should be successful")
	public void transfer_should_be_successful() {
	    System.out.println("Transfer amount got successful");
	    
	}

}
