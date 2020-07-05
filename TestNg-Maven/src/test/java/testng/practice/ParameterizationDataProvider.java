package testng.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationDataProvider {
	
	@Test(dataProvider = "getData")
	public void getSingerInfo(String firstName, String lastName) {
		System.out.println("Singer: "+ firstName + " " + lastName);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		return new Object[][] {
			{"Rihanna", "Fenty"},
			{"Beyonce", "Knowles"},
			{"Pink", "Floyd"},
			{"Justin", "Timberlake"},
			{"Jessica", "Simpson"},
			{"Maroon", "5"},
			{"Christina", "Aguilera"},
			{"Avril", "Lavigne"},
			{"Travis", "Scott"},			
		};		
	}

}
