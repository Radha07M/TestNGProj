package TestSuites;

import org.testng.annotations.*;

public class TestNGAttributes {

	@Test(priority = 0)
	public void priority0Method() {
		System.out.println("This is priority 0 Testcase");
	}
	
	@Test(priority = 4)
	public void priority4Method() {
		System.out.println("This is priority 4 Testcase");
	}
	
	@Test(enabled = false)
	public void skippedMethod() {
		System.out.println("Enabled=false then Testcase will skip");
	}
	
	@Test(enabled = true)
	public void enabledMethod() {
		System.out.println("Default value of enabled attribute is true. So all methods will be by default");
	}
	
	@Test(alwaysRun = true, dependsOnMethods = {"mependentMethod"})
	public void lwaysRunMethod() {
		System.out.println("This method will execute every time whether depends on method fail/pass");
	}
	
	@Test(testName = "Dependent Method",
			description = "Dependent method of alwaysRunMethod")
	public void mependentMethod() {
		System.out.println("This is created for dependent method");
	}
		
	@BeforeClass
	public void beforeClass() {
		System.out.println("\n-------Class "+getClass().getName()+" started-------");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("-------Class "+getClass().getName()+" Finished-------\n");
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
