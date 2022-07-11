package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _1assertequal {
	
	
	//if both actual vs expected result is same then the test case is pass otherwise fail
	@Test
	public void login() {
		String actual="facebook";
		String expected="facebook";
		Assert.assertEquals(actual, expected);
	}
	
	
	@Test
	public void page() {
		String actual="facebook";
		String expected="facebo0000ok";
		Assert.assertEquals(actual, expected);
		System.out.println("login pass");
	}
	

}
