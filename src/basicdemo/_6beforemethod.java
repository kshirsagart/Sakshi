package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _6beforemethod {
	
	//this annotation containing method will get execute before the @Test
	
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
	
	//this annotation containing method will get execute after @Test
	
	

}
