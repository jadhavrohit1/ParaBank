package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	protected static WebDriver driver;
	
	protected Logger logger;
	 protected Properties p;

	@BeforeClass(groups= {"Sanity","Regression","Master"})
	//@Parameters({"os","browser"})
	protected void setup() throws IOException
	{
	   // Set explicit log4j2 configuration file path
       // System.setProperty("log4j.configurationFile", "C:\\Users\\Rohit\\ParaBank\\src\\test\\resources\\log4j2.xml");

        // Debugging Log4j2 Configuration
        System.out.println("Initializing Log4j2...");
		logger=LogManager.getLogger(this.getClass());

		
		//loading properties file
		FileReader file=new FileReader("C:\\Users\\Rohit\\ParaBank\\src\\test\\resources\\Config.properties");
		p=new Properties();
		p.load(file);

        logger.info("Initializing WebDriver...");

		driver=new ChromeDriver();
		/*
		switch (br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("invalid browser"); return;

		}*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("app"));
        logger.info("Opened the application URL.");

		driver.manage().window().maximize();
	}

	@AfterClass(groups= {"Sanity","Regression","Master"})
	protected void teardown()
	{
		driver.close();
	}

}
