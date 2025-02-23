package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import testBase.Baseclass;

public class Logintest extends Baseclass {


	@Test(groups={"Sanity","Master"})
	void logintest() throws InterruptedException
	{
		Login_Page lp=new Login_Page(driver);
		lp.username(p.getProperty("username"));
		Assert.assertEquals("username", "username", "username is invalid");
       
		lp.password(p.getProperty("password"));
		Assert.assertEquals("password", "password", "password is invalid");

		lp.login();
		Assert.assertTrue(driver.getCurrentUrl().contains("overview"), "login failed: User not redirected to dashboard!");
	
	}
	

	

}
