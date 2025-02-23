package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;


public class Homepage extends BasePage {
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}

	
    @FindBy(xpath = "//*[text()='Register']") WebElement registerLink;
    @FindBy(xpath = "//a[normalize-space()='Contact Us']") WebElement contactUs;
    @FindBy(xpath = "//a[normalize-space()='Admin Page']") WebElement adminPage;
    @FindBy(xpath = "//*[text()='Home']") WebElement home;
    @FindBy(xpath = "//*[text()='Bill Pay']") WebElement billPay;
    @FindBy(xpath = " //a[@href='services/bank?_wadl&_type=xml'][normalize-space()='Transfer Funds']") WebElement transferFunds;

	
	// Action methods

	public void clickRegister()
	{
		registerLink.click();
		System.out.println(driver.getCurrentUrl());
	}

	public void clickContactUs()
	{
		contactUs.click();
		System.out.println(driver.getCurrentUrl());

	}
	
	public void clickAdminPage()
	{
		adminPage.click();
		System.out.println(driver.getCurrentUrl());

	}
	
	public void clickHome()
	{
		home.click();
		System.out.println(driver.getCurrentUrl());
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void clickBillPay()
	{
		billPay.click();
		System.out.println(driver.getCurrentUrl());
	}
	
	public void clickTransferFunds()
	{
		transferFunds.click();
		System.out.println(driver.getCurrentUrl());

	}
	
}
