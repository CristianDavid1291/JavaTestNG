package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is -  " + result.getName() + "starting");
		System.out.println("Test case is starting");
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status -  " + result.getStatus());
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed - screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
