package TestNGPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4J {


	static Logger logger;
	@BeforeTest
	
	public void Setup()
	{
		
		logger = Logger.getLogger("Log4J");
		PropertyConfigurator.configure("Log4J.properties");
		logger.info("Setup method is in progress");
		
		System.out.println("This Is Setup Method");
		
	}

	@Test(priority=1)
	public void Login()
	{
		 logger.info("Login metod is in progress");
		System.out.println("This Is Login Method");
		
		
	}

	@AfterTest
	public void Logout()
	{
		 logger.info("Logout is in Progress");
		System.out.println("This Is Logout Method");
		
	}

}

