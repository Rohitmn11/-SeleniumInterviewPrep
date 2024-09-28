package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.PageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.com/";
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();	
		
		
		driver.get(url);	
		driver.manage().window().maximize();
		PageObject pg= new PageObject(driver);
		
		pg.search("learn selenium");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		pg.Clickonsearch();
//		
//		WebElement ele = driver.findElement(By.xpath("//*[@id='APjFqb']"));
//		//
//		WebElement ele1 = driver.findElement(By.xpath("//*[@name='btnK']"));
//		ele.sendKeys("learn selenium");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		S
		//driver.quit();
	}
}



