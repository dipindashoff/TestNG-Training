package testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggingListenerTest extends ITestListenerImpl{
	
	@Test
	public void pass() {
		System.out.println("Yippee!");
	}
	
	@Test
	public void fail() {
		Assert.fail("Oh sh!t");
	}

}
