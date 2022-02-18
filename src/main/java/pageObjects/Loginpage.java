package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{

	public WebDriver driver;

	public Loginpage(WebDriver driver)
	{
		this.driver =driver;
		
	}
	
	By username =By.cssSelector("[id='user_email']");
	By password =By.cssSelector("[type='password']");
	By login =By.cssSelector("[type='submit']");
	
	
	public WebElement username()
	{
		return driver.findElement(username);
		
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
		}
	
	

}
