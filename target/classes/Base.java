package Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Base 
{

	public  WebDriver driver;
	public Properties prop;
	public String url;
    
	
public WebDriver initializeDriver() throws IOException
	//public void Navigation() throws IOException, InterruptedException
{
	
 prop= new Properties();
 FileInputStream fis=new FileInputStream("C:\\Users\\triloknath.kakumani\\eclipse-workspace\\E2EProject1\\src\\main\\java\\Resources\\Data1");
 prop.load(fis);
String browserName=prop.getProperty("browser");
url=prop.getProperty("url");

System.out.println(browserName);


if(browserName.contains("chrome"))
{
	 System.out.println("INN");
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver= new ChromeDriver();
	
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return driver;
}


  public String getScreenShotPath(String testCaseName, WebDriver driver) throws
  IOException 
  { 
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File source=ts.getScreenshotAs(OutputType.FILE); 
  String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
  FileUtils.copyFile(source,new File(destinationFile));
  return destinationFile;
   
  }
 }

