package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By name= By.xpath("//*[@id='APjFqb']");
	By clickonbutton= By.xpath("//*[@name='btnK']");
	
	public void search(String username) {
		driver.findElement(name).sendKeys(username);
	}	
	public void Clickonsearch() {
		driver.findElement(clickonbutton).click();
	}
	
}
