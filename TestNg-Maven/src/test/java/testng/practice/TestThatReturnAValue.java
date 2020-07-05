package testng.practice;

import org.testng.annotations.Test;

public class TestThatReturnAValue {

	@Test
	public int returnsInt() {
		System.out.println("This method returns a number");
		return 1;
	}

	@Test
	public void returnsNothing() {
		System.out.println("This method does not return any value");
		System.out.println("Return value: " + returnsInt());
	}

}
