package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _5assetnull {

	@Test
	public void login() {
		String expected=null;
		Assert.assertNull(expected);
	
	}
	@Test
	public void page() {
		 
		String expect="hello c++";
		   Assert.assertNull( expect);		
	
}

}
