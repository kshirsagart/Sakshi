package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _9BeforeSuite {

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
	

	@BeforeTest
	public void j() {
		Reporter.log("j", true);
	}
	
	@AfterTest
	public void r() {
		Reporter.log("r", true);
	}	
	
	@BeforeSuite
	public void s() {
		Reporter.log("s", true);
	}
	
	@AfterSuite
	public void h() {
		Reporter.log("h", true);
	}	
	
	
		
	
		
	

}
