package testng.files;

import org.testng.annotations.Test;

public class GroupTests {

	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("Fast test");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("Slow test");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {
		System.out.println("functest and checkintest");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod2() {
		System.out.println("functest and checkintest");
	}

	@Test(groups = { "functest" })
	public void testMethod3() {
		System.out.println("functest");
	}

	@Test(groups = { "windows.checkintest" })
	public void testWindowsOnly() {
		System.out.println("windows.checkintest");
	}

	@Test(groups = { "linux.checkintest" })
	public void testLinuxOnly() {
		System.out.println("linux.checkintest");
	}

	@Test(groups = { "windows_functest" })
	public void testWindowsToo() {
		System.out.println("windows_functest");
	}

	@Test(groups = { "Apple_suffix" })
	public void testsuffix() {
		System.out.println("Apple_suffix");
	}

	@Test(groups = { "Apple_prefix" })
	public void testprefix() {
		System.out.println("Apple_prefix");
	}
}
