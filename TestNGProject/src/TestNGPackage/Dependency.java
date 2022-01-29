package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

	@Test(priority=1)
	void OpenURL()
	{
		System.out.println("Opened URL");
	    Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods= {"OpenURL"})
	void Login()
	{
		System.out.println("Opened Login");
		
	}
	@Test(priority=3,dependsOnMethods= {"OpenURL","Login"})
	void search()
	{
		System.out.println("Opened Search");
		
	}
	@Test(priority=4)
	void advancesearch()
	{
		
		System.out.println("Opened Advance Search");
	}
	@Test(priority=5)
	void Logout()
	{
		
		System.out.println("Opened Logout");
	}
	
	
	
}
