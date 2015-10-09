package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	//Now if u want to skip teh TC run,u can mention it inside the @Beforetest in that particular file
@BeforeTest
public void beforenews()
{
	System.out.println("Opening news browser");
	//To skip the test,u will throw skipexception
	//throw new SkipException("Skipping th etest becoz of some reason");
	//So now when u will run the testsuite,it will skip YahooNews
}

@Test
public void newsTest()
{
	System.out.println("Reading news");
	//Now if u want to verify taht if the link or any text is present or not or
	//u want to verify that whether the actual value is same as expected value or not
	//for these cases we use assertions
	//so the firdt function u can use is assertequals of the assert class which takes the expected value and actual value
	//Assert.assertEquals("good", "not good");//so here actual and expected are not equal so this will fail
System.out.println("Before Assertion error");
	//Nowu acn also use asserttrue of teh assert class which print the error message if the conditionn eveluates to false
try{	
Assert.assertTrue(6>11, "Incorrect"); 
}catch(Throwable t)
{
	System.out.println("Error encountered");
	//now the error will get printed "Error encountered" and the execution continues
	//but when when u will look the reports it will say taht Testcase passed and no failure trace will be there
}

//so here the condition eveluates to false and it will print Incorrect
//here is one  more method assertfalse of the assert class which prints the error message when the condition evealuates to true
//If the assertion fails then the rest of the code will not get executed which is inside that file.
	//to overcome this we will use try and catch block.
	//we will put try around assertion if it fails,the control,will go to the catch block and will recover from the error and execution ccontinues
	Assert.assertFalse(1>9, "Correct");
	System.out.println("After assertion error");
}
}

//Now in order to run them in a batch or in suite,we will use testng.xml file 
//in whih we will give the name to the suite and testnames which can be anything and under the testname we will mention the name of teh testcases which we want to run
//and then when you will right to click on testng.xml to run it,it will give the option to run as testng suite
//the scenario where assertion can be used is suppose u go to a website and want to clicck all the links present on the page and verify that the next page opens up or not
//now if any one of the links does not work then the assertion will fail there and u want to execute rest of the links so in that case assertion with trya nd catch will be used