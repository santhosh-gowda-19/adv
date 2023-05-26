package qsp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsScripting {
	
	@Test
	public void test1()
	{
		System.out.println("compose");
	}
	@Test
	public void test2()
	{
		System.out.println("sent items");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("trash");
	}
}
