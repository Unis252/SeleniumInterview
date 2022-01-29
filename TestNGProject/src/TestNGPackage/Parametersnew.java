package TestNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersnew {
	

	@Parameters("a")
	@Test(priority=1)
	
	void OpenURL(String S)
	{
		
		System.out.println("S");
	}

	
	

}
