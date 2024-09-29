package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGDataProvider_Test {
	// this will take data from dataprovider which we created
	@Test(dataProvider="ReadExcel")
	public void TestChrome(String uname,String password){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Load application
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		// clear email field
		driver.findElement(By.name("FullName")).clear();
		// Enter username
		driver.findElement(By.name("FullName")).sendKeys(uname);
		// Clear password field
		driver.findElement(By.name("Email")).clear();
		// Enter password
		driver.findElement(By.name("Email")).sendKeys(password);
	}
	@DataProvider(name="ReadExcel")
	public Object[][] TestDataFeed(){

		// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object [][] twitterdata=new Object[2][2];

		// Enter data to row 0 column 0
		twitterdata[0][0]="username1@gmail.com";
		// Enter data to row 0 column 1
		twitterdata[0][1]="Password1";
		// Enter data to row 1 column 0
		twitterdata[1][0]="username2@gmail.com";
		// Enter data to row 1 column 0
		twitterdata[1][1]="Password2";
		// return arrayobject to testscript
		return twitterdata;
	}
}