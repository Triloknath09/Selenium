package Academy.E2EProject1;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.Loginpage;


public class HomepageTest extends Base {
	
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
		
	@BeforeTest
	 public void intializedriver() throws IOException
	  { 
	          driver = initializeDriver();
			   log.info("Driver intialized");
		
	  }
	
	
	
	@Test(dataProvider="getData")	
	  public void Credentials(String Username,String Password) throws IOException, InterruptedException  
	  { 
		//System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		  driver.get(url);
		   log.info("login to the url");
		   Thread.sleep(200);  
		   LandingPage ps =new LandingPage(driver);
		   ps.getLogin().click();
		   Thread.sleep(200);   
		   Loginpage ls= new Loginpage(driver);
		   ls.username().sendKeys(Username);
		   ls.password().sendKeys(Password);
		   ls.getLogin().click();

		   
	  }
	
		   
@DataProvider
public  Object[][] getData()
{		   
	  Object[][] data=new Object[2][2];
	  
		
		   data[0][0]="nonrestricteduser@qw.com";
		   data[0][1]="123456";
		   //data[0][2]="";
		   
data[1][0]="restricteduser@qw.com";
data[1][1]="456788";
//data[1][2]="";
return data;
		  		  		   
}


 @AfterTest 
 public void closebrowser() { 
	 
	 driver.close(); 
	 }
 


}
