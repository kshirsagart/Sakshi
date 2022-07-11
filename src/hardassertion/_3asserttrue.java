package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3asserttrue {

	//it is used to verify the condition true or false..if condition true the test case is pass otherwise fail
	@Test
	public void login() {
		String expected="hello java";
		Assert.assertTrue(true, expected);
	
	}
	@Test
	public void page() {
		 
		String expect="hello c++";
		   Assert.assertTrue(false, expect);		
	
}
}