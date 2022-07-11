package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2NoPriority {

	//if we no set the priority of test case then the execution will depends on the dictionary
	@Test
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
