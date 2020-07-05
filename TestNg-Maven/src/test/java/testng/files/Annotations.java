package testng.files;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running @BeforeClass tag \n");
	}

	@Test(description = "This test doesn't do much work")
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running @AfterClass tag\n");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running @BeforeMethod tag");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running @AfterMethod tag\n");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
//		Assert.assertTrue(false);
//		System.out.println("This line comes right after assert statement");
	}
	
	@Test
	public int test4() {
		System.out.println("Test4");
		return 1;
	}
	
	

}
