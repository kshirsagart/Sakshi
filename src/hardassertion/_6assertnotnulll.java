package hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _6assertnotnulll {
          
	
	@Test
	public void login() {
		String expected=null;
		Assert.assertNotNull(expected);
	
	}
	@Test
	public void page() {
		 
		String expect="hello c++";
		   Assert.assertNotNull( expect);		
	
}


}
