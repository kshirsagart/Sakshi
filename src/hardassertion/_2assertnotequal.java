package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _2assertnotequal {

	
	//if both actual vs expected result are not match then the test case is pass otherwise fail
	
	@Test
	public void login() {
		String actual="facebook";
		String expected="facebooooook";
		Assert.assertNotEquals(actual, expected);
	
	}
	@Test
	public void page() {
		String actual="facebook";
		String expected="facebook";
		Assert.assertNotEquals(actual, expected);
	}
	

}
