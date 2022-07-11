package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _5invocationcount {
	
	//if we want to the execute particular test case multiple time then we use invocation count

	@Test(invocationCount=3)
	public void m() {
		Reporter.log("m", true);
	}
	
	@Test
	public void a() {
		Reporter.log("a", true);
	}
	
	@Test
	public void z() {
		Reporter.log("z", true);
	}
	
	@Test
	public void t() {
		Reporter.log("t", true);
	}
	
}
