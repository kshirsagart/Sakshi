package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _7BeforeClass {
	
	//this annotation containing method will get execute before the start on anything from class
	//this annotation containing method will get execute after the completion of method in class
	@BeforeMethod
	public void m() {
		Reporter.log("m", true);
	}
	
	@Test
	public void a() {
		Reporter.log("a", true);
	}
	
	@AfterMethod
	public void z() {
		Reporter.log("z", true);
	}
	
	@BeforeClass
	public void k() {
		Reporter.log("k", true);
	}
	
	@AfterClass
	public void p() {
		Reporter.log("p", true);
		
	
		
	}

	
		
	

}
