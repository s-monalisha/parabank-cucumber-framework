package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage {
	WebDriver driver;
	
	public TransferFundsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Transfer Funds")
	WebElement transferlnk;
	
	@FindBy(css="input#amount")
	WebElement amount;
	
	@FindBy(xpath="//input[@value='Transfer']")
	WebElement transferbtn;
	
	public void clkTransferlnk() {
		transferlnk.click();
	}
	
	public void enterAmount() {
		amount.sendKeys("kjh");
	}
	
	public void clkTransferBtn() {
		transferbtn.click();
	}
	

}
