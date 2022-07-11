package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _4assertfalse {
	
	@Test
	public void login() {
		String expected="hello java";
		Assert.assertFalse(false, expected);
	
	}
	@Test
	public void page() {
		 
		String expect="hello c++";
		   Assert.assertFalse(true, expect);
		   System.out.println("Hello java");
	
}

}
