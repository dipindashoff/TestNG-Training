package testng.files;

import org.testng.annotations.Test;

public class AssertionsTest{
	
	@Test
	public void testFail() {
	  assert "ABC".equals("abc") : "This test failed :-(";
	}

}
