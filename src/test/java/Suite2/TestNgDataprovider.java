package Suite2;

import org.testng.annotations.*;

public class TestNgDataprovider {
	int sum=0,diff;
	@DataProvider(name="TwoDigitNumbers")
	public Object[] twoNumber(){
		return new Object[] {10,20};
	}
	
	@Test(dataProvider = "TwoDigitNumbers")
	public void dataprovider1(Integer intNum) {
		sum +=intNum;
		System.out.println(sum);
	}
	
	@Test(dataProvider = "TwoDigitNumbers")
	public void dataprovider2(Integer intNum) {
		diff -=intNum;
		System.out.println(diff);
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

	@AfterMethod
	public void afterMethod2() {
		System.out.println("\n-------Testcase Finised-------");
	}
	
	
}
