package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_login {
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public Pom_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void uField(String un)
	{
		username.sendKeys(un);
	}
	public void pwdField(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void btn()
	{
		loginBtn.click();
	}
	
	
	
	
	
}
