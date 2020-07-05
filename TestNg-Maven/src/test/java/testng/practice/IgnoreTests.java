package testng.practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreTests {

	@Test
	public void child1() {
		System.out.println("I have all the money in the world");
	}

	@Test
	public void child2() {
		System.out.println("I'm tall and handsome and get women");
	}

	@Test
	public void child3() {
		System.out.println("I'm superior - kneel before me");
	}

}
