package qsp;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Data1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed capture screenshot");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");
	}
}
