package testCases;

import org.testng.annotations.Test;

import pageObjects.Registration;
import testBase.Baseclass;

public class Registractionprocesstest extends Baseclass {
	@Test( priority=2,groups={"Sanity","Master"})
	void userRegistrationprocesstest() throws InterruptedException
	{
		Registration sp=new Registration(driver);
		
		sp.clickRegister();
		sp.firstName("rohit");
		sp.lastName("jadhav");
		sp.address("n6 codco");
		sp.city("pune");
		sp.state("maharashtra");
		sp.zipCode("12345");
		sp.phoneNumber("1231234569");
		sp.ssn("123456");
		sp.username("user12");
		sp.password("password");
		sp.repeatedPassword("password");
		sp.regeisterbutton();	
	}
	
}
