package SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CrossbrowserUsingXML {


WebDriver driver = null;	

@Parameters("browser")
@Test(priority=1)
public void LaunchBrowser(String br)
{

	if(br.equals("Chrome"))
			{
			
		    System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    }
	
	else if(br.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
	}

 driver.get("https://newtours.demoaut.com");

}

@Test(priority=2)
public void Registration()
{
	Assert.assertTrue(true);
}

@Test(priority=3)
public void closebrowser()
{
	
	driver.close();
	
}




}
