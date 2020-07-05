package testng.files;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	// This method will provide data to any test method that declares that its Data
	// Provider
	// is named "test1"
	@DataProvider(name = "test1")
	public Object[][] createData1() {
		return new Object[][] { { "Cedric", new Integer(36) }, { "Anne", new Integer(37) }, };
	}

	// This test method declares that its data should be supplied by the Data
	// Provider
	// named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(String n1, Integer n2) {
		System.out.println(n1 + " " + n2);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] obj = new Object[2][2];
		obj[0][0] = "Deesha";
		obj[0][1] = "Dipin";
		obj[1][0] = "Sindiya";
		obj[1][1] = "Dipin";

		return obj;
	}

	@DataProvider
	public Object[][] getHashMap() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("singer1", "Maroon5");
		map1.put("singer2", "Michael Jackson");

		Map<String, String> map2 = new HashMap<>();
		map2.put("singer1", "Beyonce Knowles");
		map2.put("singer2", "Rihanna Fenty");

		return new Object[][] { { map1 }, { map2 } };
	}

	@Test(dataProvider = "getData")
	public void testDataProvider1(String firstName, String lastName) {
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
	}

	@Test(dataProvider = "getHashMap")
	public void testDataProvider2(Map<String, String> map) {

		System.out.println("singer1: " + map.get("singer1"));
		System.out.println("singer2: " + map.get("singer2"));

	}
	
	// You must need to mention data provider method name in Test method
    @Test(dataProvider="DataContainer")
    public void methodWithSingleAttribute(String a) {
        System.out.println(a);
       
    }
      
     
    // A data provider which will provide single value to a test method thrice.
    @DataProvider(name="DataContainer")
    public Object[] myDataProvider() {
         
        // Passing 3 set of data and each set contains single value
        Object data[]=  new Object[3];
        data[0]= "Make"; 
        data[1]= "Selenium";
        data[2]= "Easy";
        return data;
    }

}
