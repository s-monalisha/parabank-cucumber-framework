package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ExcelReader;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;

	String username;
	String password;

//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//		driver = new DriverFactory().init_driver();
//	    
//	}
//	@Then("page title should be {string}")
//	public void page_title_should_be(String expectedTitle) {
//		String actualTitle = driver.getTitle();
//		System.out.println("Actual Title: "+ actualTitle);
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}

	 @Given("user is on the login page")
	public void user_is_on_the_login_page() {

		driver = new DriverFactory().getDriver();
		loginPage = new LoginPage(driver);

//		String path = System.getProperty("user.dir") + "/testdata/loginData.xlsx";

		// Read data from Excel
//		username = ExcelReader.getCellData(path, "LoginData", 1, 0);
//		password = ExcelReader.getCellData(path, "LoginData", 1, 1);

	}

	

	
//	@When("user enters username from excel")
//	public void user_enters_username_from_excel() {
//		loginPage.enterUsername(username);
	 @When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUsername(username);

	}

//	@When("user enters password from excel")
//	public void user_enters_password_from_excel() {
	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);

	}

	@When("user clicks login")
	public void user_clicks_login() {
		loginPage.clkLoginbtn();

	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		System.out.println("Login executed successfully");

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("ParaBank"));

	}

//	  @Given("User navigates to login page")
//	    public void user_navigates_to_login_page() {
//
//	        driver = DriverFactory.getDriver();
//	        loginPage = new LoginPage(driver);
//	    }
//
//	    @When("User logs in with Excel data")
//	    public void user_logs_in_with_excel_data() {
//
//	        List<Map<String,String>> data = ExcelReader.getData("Sheet1");
//
//	        for(Map<String,String> row : data){
//
//	            String username = row.get("username");
//	            String password = row.get("password");
//
//	            loginPage.login(username,password);
//	        }
//	    }
//
//	    @Then("Login should be successful")
//	    public void login_should_be_successful() {
//
//	        Assert.assertTrue(driver.getTitle().contains("ParaBank"));
//	    }
	}

