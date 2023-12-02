package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener{
	
	//"This id modified "
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test is started :"+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successful :"+ result.getName());

	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed :"+ result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped :"+ result.getName());
	}
	
	/*public void onStart(ITestContext context) {
		System.out.println("Test is started :"+ context.getName());
	} */
	
	/*public void onFinish(ITestContext context) {
		System.out.println("Test is finished :"+ context.getName());
	}
	*/
	

}
