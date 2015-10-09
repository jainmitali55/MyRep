package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	//this annotation will be present only in one java file of the test suite @beforesuite and @aftersuite
 @BeforeSuite //it will get executed before running all the Test across multiple java files in one suite
 public void initializeselenium()//For examlple u want to initialize selenium before running the suite
 {
	 System.out.println("In the very beginning ---destroy the selenium");
	 //selenium object-webdriver
 }
 @AfterSuite //It will get executed after running all the tests across multiple java files in one suite
 public void closeSelenium()//For eample u want to close selenium after running the suite
 {
	 System.out.println("In the very end ---destroy the selenium");
	// Selenium objects destroyed
 }
	
	@Test
  public void testSendingEmail() {
	  System.out.println("Sending test email");
  }
  @Test
  public void testReceivingEmail() {
	  System.out.println("Receiving test email");
  }
  @BeforeMethod //This annotation will get executing before each and and every @Test
  public void beforeMethod() {
	  System.out.println("In before method");
	  //For example-u want to open a browser before sending or receiving email
	  
  }

  //there is one more annotation called aftermethod which will get executed each and every time after running each every @Test
  @AfterMethod
  public void closeBrowser()
  {
	  System.out.println("Closing the browser");
  }
  @BeforeTest //This annotation will get executed before running any of the Tcs  in a particular java fileand only one time
  public void beforeTest() {
	  System.out.println("In before test method");
	  //For example-u want to connect to database before beginning the Tc s run
  }
  //@AfterTest-this will be called only after running all the testcases inside the class
  @AfterTest
  public void closeconnection()
  {
	  System.out.println("Closing the database connection");
	  //Suppose u wnat to close the database cconction after running all the Tcs
  }
  

}
