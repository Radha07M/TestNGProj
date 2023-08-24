package TestSuites;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DynamicTable {
	WebDriver driver;
	
	@Test(description = "Handle Dynamic Table in selenium")
	public void handleDynamicTable() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Nilesh//Documents//GitHub//TestNGProj//src//test//resources//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//List<WebElement> columns = driver.findElements(By.xpath("//*[@class='dataTable']//thead/tr//th"));
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='dataTable']//tbody/tr"));

		JavascriptExecutor jse=(JavascriptExecutor)driver;		
		Map<String, Double> filteredData = new HashMap<String, Double>();
		
		System.out.println("Totol no of Row: "+rows.size());
		//System.out.println("Totol no of Column: "+columns.size());
		for(int i=1;i<=rows.size();i++) {
			WebElement cellObj = driver.findElement(By.xpath("//*[@class='dataTable']//tbody/tr["+i+"]//td[4]"));
			WebElement rowObj = driver.findElement(By.xpath("//*[@class='dataTable']//tbody/tr["+i+"]//td[1]"));
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			
			String cellValue = cellObj.getText().trim();
			String companyName = rowObj.getText().trim();
			if(Double.parseDouble(cellValue)>=500) {
				filteredData.put(companyName, Double.parseDouble(cellValue));
			}
		}
		TreeMap<String, Double> sort = new TreeMap<String, Double>();
		sort.putAll(filteredData);
		for(Map.Entry<String, Double> entry:sort.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
	
	@AfterMethod()
	public void killDriver() {
		driver.quit();
	}
}
