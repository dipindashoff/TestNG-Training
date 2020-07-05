package testng.practice;

import org.testng.annotations.Test;

@Test(groups = {"team"})
public class PartialGroups {
	
	@Test(groups = {"Tester"})
	public void tester1() {
		System.out.println("manual tester");
	}
	
	@Test(groups = {"Tester"})
	public void tester2() {
		System.out.println("automation tester");
	}
	
	@Test
	public void business1() {
		System.out.println("business analyst");
	}
	
	@Test(groups = {"Developer"})
	public void developer() {
		System.out.println("I have horns");
	}

}
