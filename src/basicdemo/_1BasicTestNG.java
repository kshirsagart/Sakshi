package basicdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _1BasicTestNG {
	
	@Test
	public void login() {
		System.out.println("hello tushar");
		//these statement will give the result in console only
		
		Reporter.log("login pass", true);
		
		//these statement will give a result in emailable report as well as console if the booblean expression is true
	}
	
	@Test
	public void print() {
		System.out.println("hello amol");
		//these statement will give the result in console only
		
		Reporter.log("print pass", false);
		
		//these statement will give a result only in emailable report if the boolean expression is false
	}

}
