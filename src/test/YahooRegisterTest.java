package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegisterTest {
	
	@Test (dataProvider="registerdata") //we are telling @Test that the data will be provided to you by registerdata
	public void registrationTest(String username,String password,String email,String city)//Now we will pass the no of argument with the same type as data and which will be equla to the number of parameters
	{
		System.out.println("username " +username+ " password " +password+ " email " +email+ " city " +city);
		//selenium code
	}
	@DataProvider //This annotation is used to parameterize the TCs
	public Object[][] registerdata() //this method will return the data of two dimensional object[][] array
	{
		//rows=no of times u want to run the test-3
		//columns=no of parameters-4 username,password,email and city
		//Now we will declare the two dimensional object array
		Object[][] data=new Object[3][4];
		//we will fill the data
		data[0][0]="user1";
		data[0][1]="pass1";
		data[0][2]="email1";
		data[0][3]="city1";
		data[1][0]="user2";
		data[1][1]="pass2";
		data[1][2]="email2";
		data[1][3]="city2";
		data[2][0]="user3";
		data[2][1]="pass3";
		data[2][2]="email3";
		data[2][3]="city3";
		return data;
	}

}//Number of test runs in the report will be equal to 3 as we are running with three sets of data
