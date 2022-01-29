package TestNGPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowsertesting {

	
	WebDriver driver=null;
	@Parameters("browser")
	@Test(priority=1)
	public void OpenURL(String br)
	{
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			    driver = new ChromeDriver();
		}
		
		else if(br.equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
		}
	
	  
	   driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority=2)
	public void Login()
	
	{
	
		driver.findElement(By.id("email")).sendKeys("8297914990");
		driver.findElement(By.id("pass")).sendKeys("9440757330");
		driver.findElement(By.id("u_0_b")).click();
	}

	@Test(priority=3)
	void Close()
	{
		
		driver.close();
	}
	
	

 @AfterMethod()
 public void TakeScreenshort() throws IOException
 {
	 
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 
	 File Source = ts.getScreenshotAs(OutputType.FILE);
	 
	 File target = new File(System.getProperty("user.dir")+"/sceeenshorts/"+"Second"+".png");
	 
	 FileUtils.copyFile(Source,target);
	 
	 System.out.println("Captured Screenshort");
	 
 }











}


