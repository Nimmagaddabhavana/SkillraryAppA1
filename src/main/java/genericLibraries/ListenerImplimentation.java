package genericLibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplimentation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.print(result.getMethod().getMethodName()+"execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.print(result.getMethod().getMethodName()+"pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.print(result.getMethod().getMethodName()+"Faild");
		System.out.print("Failure occured due to:"+result.getThrowable());
		WebDriverUnity web = new WebDriverUnity();
		web.takeScreenshort(BaseClass.sdriver,result.getMethod().getMethodName(), BaseClass.sjutil);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.print(result.getMethod().getMethodName()+"skipped");
		System.out.print("Skipped due to:"+result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.print("Suite execution sterts");	
		}
	
	

	@Override
	public void onFinish(ITestContext context) {
		System.out.print("Suite execution ends");
		}

	
}
