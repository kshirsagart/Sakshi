package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _4enabled {

	//if we want to ignoring  the particular test case from execution process then we used unabled false 
	
	@Test(enabled=false)
	public void m() {
		Reporter.log("m", true);
	}
	
	@Test(enabled=true)
	public void a() {
		Reporter.log("a", true);
	}
	
	@Test(enabled=true)
	public void z() {
		Reporter.log("z", true);
	}
	
	@Test(enabled=true)
	public void t() {
		Reporter.log("t", true);
	}
}
