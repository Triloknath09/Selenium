package Academy.E2EProject1;

import static org.testng.AssertJUnit.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Base;

/**
 * Unit test for simple App.
 */



public class AppTest1 
{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrueTest()
    {
        //assertTrue( true );
    	System.out.println("test");
    	System.out.println("test1");
    }
    
    
    
}
