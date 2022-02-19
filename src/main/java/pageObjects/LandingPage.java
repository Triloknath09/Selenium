package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
		
	By signin= By.xpath("//span[text()='Login']");
	By text= By.xpath("//h2[text()='Featured Courses']");
	By Navigation= By.xpath("//a[@href='https://www.rahulshettyacademy.com/AutomationPractice' and text()='Practice']");
	
	
	public LandingPage (WebDriver driver)
	{
	
		this.driver =driver;
     }
		
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(text);
		
	}
	
	
	  public WebElement NavigationBar() {
		  return driver.findElement(Navigation);
	  
	  }
	 
		
}
