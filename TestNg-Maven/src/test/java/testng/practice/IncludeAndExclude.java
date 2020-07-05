package testng.practice;

import org.testng.annotations.Test;

public class IncludeAndExclude {
	
	@Test
	public void include() {
		System.out.println("Include this method");
	}
	
	@Test
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test
	public void exclude() {
		System.out.println("exclude this method");
	}

}
