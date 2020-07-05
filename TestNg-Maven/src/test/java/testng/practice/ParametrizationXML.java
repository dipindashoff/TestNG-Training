package testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationXML {
	
	@Parameters({"firstname", "lastname"})
	@Test
	public void employee(String fname, String lname) {
		System.out.println("My first name is " + fname);
		System.out.println("My last name is " + lname);
	}

}
