package testng.files;

import org.testng.annotations.Test;

public class ListenersTest extends ITestListenerImpl{
	
	@Test(priority = 0)
	public void testPass() {
		assert "Dipin".equals("Dipin") : "Hippeee";
	}
	
	@Test(priority = 1)
	public void testFail() {
		assert "Dipin".equals("Test") : "Oh Sh!t";
	}

}
