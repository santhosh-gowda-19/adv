package generic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(base);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}

}
