package pageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebDriver driver;

	private By Username=By.xpath("//input[@id='username']");
	private By Password=By.xpath("//input[@id='password']");
	private By Login=By.xpath("//input[@id='Login']");


	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement clickOnLogin()
	{
		return driver.findElement(Login);
	}

}
