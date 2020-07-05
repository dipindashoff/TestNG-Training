package testng.files;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedCases extends IRetryAnalyzerImpl {

	@Test(retryAnalyzer = IRetryAnalyzerImpl.class)
	public void testRetry() {
//		System.out.println("This test case failed");
//		Assert.fail(); // Total tests run: 4, Passes: 0, Failures: 1, Skips: 0, Retries: 3
		assert "dip".equals("in") : "This test case failed";
	}
}
