package testng.files;

import org.testng.annotations.Test;

public class TestThatReturn {

	/*
	 * This test will run only when allow-return-values="true" in testng.xml
	 * Or it will be skipped
	 */
	@Test
	static public String returnString() {
		System.out.println("Return method");
		return "Here's a candy 4 U!";
	}

	/*
	 * This test is run
	 */
	@Test
	public void voidMethod() {
//		String s = TestThatReturn.returnString();
//		System.out.println(s);
		System.out.println("Void method");
	}
	
	// OUTPUT - when allow-return-values="false" at suite level
	// Void method
	
	// OUTPUT - when allow-return-values="true" at suite level
	// Return method
	// Void method
	
}
