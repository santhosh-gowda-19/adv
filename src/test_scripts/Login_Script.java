package test_scripts;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_scripts.Base_Test;
import pom_scripts.Pom_login;

public class Login_Script extends Base_Test{
	@Test(dataProvider = "testdata")
	public void validLogin(String d1,String d2)
	{
		Pom_login p=new Pom_login(driver);
		p.uField(d1);
		p.pwdField(d2);
		p.btn();
		Assert.fail();
	}
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "santhosh", "selenium" },
	   { "kushal", "appium"},
	 };
	}	
}
