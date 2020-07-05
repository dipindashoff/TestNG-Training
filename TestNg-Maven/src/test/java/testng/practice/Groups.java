package testng.practice;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"kids", "female"}, description = "Aysha's details")
	public void child1() {
		System.out.println("Aysha, age 3");
	}
	
	@Test(groups = {"kids", "female"})
	public void child2() {
		System.out.println("Deesha, age 5");
	}
	
	@Test(groups = {"teenagers", "male"})
	public void child3() {
		System.out.println("Kyle, age 15");
	}
	
	@Test(groups = {"adults", "female"})
	public void child4() {
		System.out.println("Nyla, age 21");
	}

}
