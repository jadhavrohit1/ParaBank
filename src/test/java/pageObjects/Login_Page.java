package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class Login_Page extends BasePage {
	
	
	    //constructor
		public Login_Page(WebDriver driver)
		{
			super(driver);
		}

	
	// locator and variables

	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@value='Log In']")  WebElement login;
	
	
	// Action methods
	
	public void username(String usname)
	{
		username.sendKeys(usname);
	}
	
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		login.click();
	}
	


}
