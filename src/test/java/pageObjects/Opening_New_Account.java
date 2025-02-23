package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class Opening_New_Account extends BasePage {
	
	public Opening_New_Account(WebDriver driver)
	{
		super(driver);
	}
	
	
	//locator
	
	@FindBy(xpath="//a[text()='Open New Account']") WebElement OpenNewAcc;
	@FindBy(xpath="//select[@id=\"type\" and  @class=\"input\"]") WebElement AccTypeInput;
	@FindBy(xpath="//*[text()='SAVINGS']") WebElement Saving;
	@FindBy(xpath="//input[@value='Open New Account']") WebElement OpenAccButton;
	@FindBy(xpath = "//h1[text()='Account Opened!']") WebElement successMessage;
	   
	
	
//	/action methods
	
	
	public void OpenNewAcc()
	{
		OpenNewAcc.click();
	}
	
	public void AccTypeInput()
	{
		AccTypeInput.click();
	}
	
	public void Saving()
	{
		Saving.click();
	}
	
	public void OpenAccButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(OpenAccButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", OpenAccButton); // Ensure visibility
	    js.executeScript("arguments[0].click();", OpenAccButton); // JavaScript Click	
	    }
	
	public Boolean successMessage()
	{
		try {
		WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		return successMessage.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}

	}
	
	
	
	

}
