package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.BasePage;

public class TransferFunds extends BasePage{
	
	//constructor
	public TransferFunds(WebDriver driver)
	{
		super(driver);
	}
	
	//locator find and stored in variable
	@FindBy(xpath="//a[text()='Transfer Funds']") WebElement transferfund;
    @FindBy(xpath="//input[@id='amount']") WebElement amt;
    @FindBy(xpath="//select[@id=\"fromAccountId\"]") WebElement fromacc;
    @FindBy(xpath="//select[@id=\"toAccountId\"]") WebElement toacc;
    @FindBy(xpath="//input[@value=\"Transfer\"]") WebElement transferbutton;
    @FindBy(xpath="//h1[text()='Transfer Complete!']") WebElement transfercomplemessage;
    @FindBy(xpath="//a[text()='Log Out']") WebElement logout;
    

  

	// Actions Methods
    
    public void transferfundlink()
    {
    	transferfund.click();
    }
    
    public void enteramt(String amount)
    {
    	amt.sendKeys(amount);
    }

    public void fromacc(String facnum) throws InterruptedException
    {
    	Thread.sleep(2000);
    	fromacc.sendKeys(facnum);
    }
    
    public void toacc(String toacnum) throws InterruptedException
    {
    	toacc.sendKeys(toacnum);
    }
    
    public void transferbutton()
    {
    	transferbutton.click();
    }
    
    public String transfercomplemessage() throws InterruptedException
    {
    	Thread.sleep(2000);
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(transfercomplemessage));
    	return transfercomplemessage.getText();
    }
    
    public void LogOut()
    {
    	logout.click();
    	
    }
    
                                   
}
