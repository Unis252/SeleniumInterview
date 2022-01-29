package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjModelAction {

	WebDriver Ldriver;
	
	PageObjModelAction(WebDriver rdriver)
	{
		
		Ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement PassWord;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement LoginBtn;
	
	public void Enail(String Username)
	{
		
		Email.sendKeys(Username);
		
	}

    public void Password(String Passwrd)
    {
    	
    	PassWord.sendKeys("Passwrd");
    }
    
    public void Loginbtn()
    {
    	
    	LoginBtn.click();
    }


}
