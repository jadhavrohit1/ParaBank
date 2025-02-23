package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class Registration extends BasePage {
	
	
	WebDriver driver;
	
	//constructor
		public Registration(WebDriver driver)
		{
		super(driver);
		}
		
		
// locator amnd stored into variable
	@FindBy(xpath="//*[text()='Register']") WebElement Registerlink;
	@FindBy(xpath="//input[@id='customer.firstName']") WebElement firstName;
	@FindBy(xpath="//input[@id='customer.lastName']") WebElement lastName;
	@FindBy(xpath="//input[@id='customer.address.street']") WebElement address;
	@FindBy(xpath="//input[@id='customer.address.city']") WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']") WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']") WebElement zipCode;
	@FindBy(xpath="//input[@id='customer.phoneNumber']") WebElement phoneNumber;
	@FindBy(xpath="//input[@id='customer.ssn']") WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']") WebElement username;	
	@FindBy(xpath="//input[@id='customer.password']") WebElement password;
	@FindBy(xpath="//input[@id='repeatedPassword']") WebElement repeatedPassword;
	@FindBy(xpath="//input[@value='Register']") WebElement Register;
		
		
	//Action Methods
	
	// For each locator we have to create a seperate action method
	public void clickRegister()
	{
		Registerlink.click();
	}

	public void firstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	
	public void address(String add)
	{
		address.sendKeys(add);
	}
	
	
	public void city(String cty)
	{
		city.sendKeys(cty);
	}
	
	
	public void state(String sta)
	{
		state.sendKeys(sta);
	}
	
	
	public void zipCode(String zip)
	{
		zipCode.sendKeys(zip);
	}
		
		
	public void phoneNumber(String ph)
	{
		phoneNumber.sendKeys(ph);
	}	
		
	public void ssn(String sn)
	{
		ssn.sendKeys(sn);
	}	
		
		
	public void username(String uname)
	{
		username.sendKeys(uname);
	}	
		
		
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}	
		
		
	public void repeatedPassword(String rpwd)
	{
		repeatedPassword.sendKeys(rpwd);
	}	
		
	public void regeisterbutton()
	{
		Register.click();
	}	
	
	}

