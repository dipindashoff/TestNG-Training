package testng.practice;

import org.testng.annotations.Test;

public class GroupsOfGroups {
	
	@Test(groups = {"Apple.Laptop"})
	public void laptop1() {
		System.out.println("Apple Laptop");
	}
	
	@Test(groups = {"Apple.Phone"})
	public void phone1() {
		System.out.println("Apple Phone");
	}
	
	@Test(groups = {"Apple.Tablet"})
	public void tablet1() {
		System.out.println("Apple Tablet");
	}
	
	@Test(groups = {"Android.Laptop"})
	public void laptop2() {
		System.out.println("Android Laptop");
	}
	
	@Test(groups = {"Android.Phone"})
	public void phone2() {
		System.out.println("Android Phone");
	}
	
	@Test(groups = {"Android.Tablet"})
	public void tablet2() {
		System.out.println("Android Tablet");
	}

}
