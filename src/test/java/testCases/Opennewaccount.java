package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Opening_New_Account;
import testBase.Baseclass;

public class Opennewaccount extends Baseclass {
	
	
	
	@Test(groups={"Regression","Master"})
	void OpenNewAccount() throws InterruptedException
	{
		
		logger.info("*****    Login test started  *****");
		Login_Page lp=new Login_Page(driver);
		logger.info("** Entering username **");
		lp.username(p.getProperty("username"));
		logger.info("** Entered username **");
		logger.info("** Entering password **");

		lp.password(p.getProperty("password"));
		logger.info("** Entered password **");

		lp.login();
		logger.info("** Clicked on the login button **");

		logger.info("*****    Opening_New_Account test started  *****");

		Opening_New_Account op=new Opening_New_Account(driver);
	
		op.OpenNewAcc();
		logger.info("** Clicked on the opennewaccount link **");

		op.AccTypeInput();
		logger.info("** Clicked on the account type dropdown**");

		op.Saving();
		logger.info("** Selected saving option **");
		
		logger.info("** clicking on the oprnaccpountbutton");
		op.OpenAccButton();
		
		
		logger.info("** clicked on the oprnaccpountbutton");
		Boolean successMessage =op.successMessage();
        Assert.assertTrue(successMessage, "Account opening failed!");
        System.out.println("Test passed: Account successfully opened!");
	}
	

}
