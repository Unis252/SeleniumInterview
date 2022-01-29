package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObjImplementation {

WebDriver driver;

 @Test(priority=1)
 public void Setup()
 {
	 
	 System.setProperty("webdriver.chrome.driver","F:\\Chrome Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	 
 }

 @Test(priority=2)
 void Login() throws InterruptedException
 {
	 
	 PageObjModelAction POA = new PageObjModelAction(driver);

	  POA.Enail("8297914990");
	  POA.Password("944075733"); 
      POA.Loginbtn();	 
      Thread.sleep(5000);
      driver.quit();
      
 
 
 }
 
 
 

}
