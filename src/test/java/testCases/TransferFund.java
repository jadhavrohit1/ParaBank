package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.TransferFunds;
import testBase.Baseclass;

public class TransferFund extends Baseclass {

	@Test(groups={"Regression","Master"})
	void transferfund() throws InterruptedException 
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

		
		logger.info("*****    TransferFunds test started  *****");

		
	TransferFunds tf=new TransferFunds(driver);
	
	tf.transferfundlink();
	tf.enteramt("10.00");
	tf.fromacc("13677");
	tf.toacc("13677");
	tf.transferbutton();
	logger.info("*****    TransferFunds test completed  *****");
	
	Thread.sleep(2000);
	String message=tf.transfercomplemessage();
	
	System.out.println(message);
	Assert.assertEquals(message, "Transfer Complete!", "Transfer failed!");
	
	tf.LogOut();
	Assert.assertTrue(driver.getCurrentUrl().contains("ConnType=JDBC"), "logout failed: User not redirected to dashboard!");
	
}
	
	
	
	
	
	
	
	
	
}
