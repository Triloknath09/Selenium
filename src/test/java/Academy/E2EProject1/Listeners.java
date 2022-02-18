package Academy.E2EProject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.Base;
import Resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener {
	ExtentReports extent = ExtentReporterNG.getReportObject();

	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		test.log(Status.PASS, "Test passed");

		
		  WebDriver driver =null; String testMethodName=
		  result.getMethod().getMethodName();
		  System.out.println("testMethodName"+testMethodName); try {
		  
		  driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField(
		  "driver").get(result.getInstance());
		  System.out.println("testMethodName"+testMethodName);
		  System.out.println("driver"+driver);
		  
		  } catch(Exception e) {
		  
		  
		  } try { System.out.println("testMethodName"+testMethodName);
		  
		  System.out.println("secondtry"); getScreenShotPath(testMethodName,driver);
		  test.addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver) );
			
		  System.out.println("driver"+driver);} catch(IOException e) {
		  e.printStackTrace();}
		 

	}

	// @Override
	public void onTestFailure(ITestResult result) {

		test.fail(result.getThrowable());

	
		
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();
		System.out.println("testMethodName" + testMethodName);
		try {

			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
			System.out.println("testMethodName" + testMethodName);
			System.out.println("driver" + driver);

		} catch (Exception e) {

		}
		try {
			
			
			System.out.println("testMethodName" + testMethodName);

			test.addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver) );
			
			System.out.println("secondtry");
			getScreenShotPath(testMethodName, driver);
			System.out.println("driver" + driver);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();

	}

}
