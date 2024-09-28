package Demo;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadFile {
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumInterview\\SeleniumInterviewPrep\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@Test
public void UploadTest() throws Exception {
driver.get("F:/SeleniumInterview/UploadFile.html");
Thread.sleep(2000);// Xpath for Edit button
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='fileToUpload']")).click(); //link text locator for uploading a photo..
driver.findElement(By.xpath("//*[@name='fileToUpload']")).sendKeys("C://Users/ACER/Downloads/pngimg.png");
driver.findElement(By.name("submit")).click();
// Mention the own path of the file location


String text = driver.findElement(By.id("main-message")).getText();
Thread.sleep(2000);// Image name can be of your choice

if(driver.findElement(By.id("main-message")).isDisplayed()) {
assertTrue(true, "Profile picture is Uploaded");
}else {
assertTrue(false, "Profile picture not Uploaded");
}
}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}