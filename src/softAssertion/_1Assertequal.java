package softAssertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _1Assertequal {

	SoftAssert sa=new SoftAssert();
	
	@Test
	public void login() {
		String actual="facebook";
		String expected="facebook";
		sa.assertEquals(actual, expected);
		System.out.println("login pass");
		sa.assertAll();
	}
	
	
	@Test
	public void page() {
		String actual="facebook";
		String expected="facebo0000ok";
		sa.assertEquals(actual, expected);
		System.out.println("login fail");
		sa.assertAll();
	}
}
