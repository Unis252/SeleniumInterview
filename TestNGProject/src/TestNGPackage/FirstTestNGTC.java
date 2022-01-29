package TestNGPackage;

import org.testng.annotations.*;

public class FirstTestNGTC {
	
	
	@Test
	void display()
	{
		System.out.println("First Method");
		
	}
	
	@Test(priority=1)
	
	void run()
	{
		System.out.println("Run Method");
	}
	
	
	
	

}
