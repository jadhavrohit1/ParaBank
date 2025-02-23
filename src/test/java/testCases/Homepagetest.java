package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import testBase.Baseclass;

public class Homepagetest extends Baseclass {

	@Test(priority=1,groups={"Sanity","Master"})
	public void verifyhomepage() throws InterruptedException
	{
		logger.info("*** Homepage test starting ****");
		Homepage hp=new Homepage(driver);
        hp.clickAdminPage();
        
		logger.info("*** clicked on AdminPage link ****");

		Assert.assertTrue(driver.getCurrentUrl().contains("admin"), "Admin Page navigation failed!");
		
	    hp.clickContactUs();
		Assert.assertTrue(driver.getCurrentUrl().contains("contact"), "Acontactdmin Page navigation failed!");
		
		logger.info("*** clicked on Contactus link ****");

		hp.clickRegister();
		Assert.assertTrue(driver.getCurrentUrl().contains("register"), "register Page navigation failed!");
		logger.info("*** clicked on Register link ****");

		Thread.sleep(1000);
		hp.back();	

		
		hp.clickHome();
		Assert.assertTrue(driver.getCurrentUrl().contains("index"), "home Page navigation failed!");
		logger.info("*** clicked on home link ****");

		
		hp.clickBillPay();
		Assert.assertTrue(driver.getCurrentUrl().contains("bank?_wadl&_type=xml"), "billpay Page navigation failed!");
		logger.info("*** clicked on billpay link ****");

		hp.back();		
		logger.info("*** clicked on back arrow ****");

		hp.clickTransferFunds();
		Assert.assertTrue(driver.getCurrentUrl().contains("bank?_wadl&_type=xml"), "transfer Page navigation failed!");	
		logger.info("*** clicked on transfer funds ****");

}
	
	
	
}
