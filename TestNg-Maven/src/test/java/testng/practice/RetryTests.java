package testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests extends IRetryAnalyzerImpl {

	private static int count = 0;

	@Test(retryAnalyzer = IRetryAnalyzerImpl.class)
	public void fail() {
		assert 5 > 10 : "5 > 10? Did you go to school?";
	}

	/*
	 * It fails 4 times. Passes 5th time.
	 */
	@Test(retryAnalyzer = IRetryAnalyzerImpl.class)
	public void fail2() {
		System.out.println("count = " + count++);
		if (count != 5)
			Assert.fail("I FAIL!");
		else
			System.out.println("I passed " + count);
	}
}
