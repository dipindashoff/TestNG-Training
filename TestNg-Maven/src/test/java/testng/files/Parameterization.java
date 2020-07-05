package testng.files;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Parameters({ "URL", "Username", "Password" })
	// Order and the number of arguments should match the order in XML
//	@Parameters({ "Username", "URL", "Password" }) 
	// Exception thrown
//	@Parameters({ "Username", "Password" }) 
	// Method getParametersFromXML requires 3 parameters but 2 were supplied in the @Test annotation.
	@Test
	public void getParametersFromXML(String url, String username, String password) {
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
	}
}
