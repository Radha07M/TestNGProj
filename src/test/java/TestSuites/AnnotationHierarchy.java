package TestSuites;

import org.testng.annotations.*;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

public class AnnotationHierarchy {

	@Test(description = "This is my Testcase")
	public void print() {
		System.out.println("This is first TestNG @Test TC");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("-------TestSuite started-------");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("-------TestSuite Finised-------");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("\n-------Class "+getClass().getName()+" started-------");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("-------Class "+getClass().getName()+" Finished-------\n");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("-------Before all Test-------");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("-------Testcase started-------\n");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("\n-------Testcase Finised-------");
	}
}
