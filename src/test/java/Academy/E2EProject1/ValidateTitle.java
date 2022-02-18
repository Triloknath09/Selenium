package Academy.E2EProject1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.Loginpage;


public class ValidateTitle extends Base 
{
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(Base.class.getName());

	@BeforeTest
	 public void intializedriver() throws IOException
	  { 
	     driver = initializeDriver();
	     log.info("Driver intialized");

		
	  }
	
	
	
	@Test
	public void Validationtitle() throws IOException, InterruptedException
			  
			  { 
	
    	       
				   driver.get(url);
				   Thread.sleep(300);		       
				   LandingPage ps =new LandingPage(driver);
				   AssertJUnit.assertEquals(ps.getTitle().getText(),"FEATURED 1COURSES");
				  // driver.close();
//return driver;
				   
			 }

	
	
	@AfterTest
	 public void close() throws IOException
	  { 
		driver.close();
	     
	  }
	
}
