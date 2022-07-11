package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _3SetProirity {
	
	//when we set the priority then the execution of test case will depends on the the priority 
	
		@Test(priority=-3)
		public void m() {
			
			Reporter.log("m", true);
		}
		
		@Test(priority=0)
		public void a() {
			Reporter.log("a", true);
		}
		
		@Test(priority=2)
		public void z() {
			Reporter.log("z", true);
		}
		
		@Test(priority=1)
		public void t() {
			Reporter.log("t", true);
		}
		

}
