package testng.practice;

import org.testng.annotations.Test;

public class RunMethodsByWildcard {
	
	@Test(priority = 0)
	public void Sun_start() {
		System.out.println("I start my day by 6 a.m.");
	}
	
	@Test(priority = 1)
	public void Sun_end() {
		System.out.println("I end my day by 6 p.m.");
	}
	
	@Test(priority = 0)
	public void Moon_start() {
		System.out.println("I start my day by 6 a.m.");
	}
	
	@Test(priority = 1)
	public void Moon_end() {
		System.out.println("I end my day by 6 p.m.");
	}
	
	@Test
	public void earth() {
		System.out.println("I love circling around the Sun with my moon!");
	}

}
