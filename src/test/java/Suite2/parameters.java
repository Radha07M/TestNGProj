package Suite2;

import org.testng.annotations.*;

public class parameters {

	@Test
	@Parameters({"a", "b","c"})
	public void paramaterTest(int a, int b, String c) {
		
		System.out.println("FirstNo: "+a);
		System.out.println("SecondNo: "+b);
		System.out.println("String: "+c);
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
