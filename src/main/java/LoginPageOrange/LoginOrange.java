package LoginPageOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginOrange {

	public static WebDriver driver;

	private By Un=By.xpath("//input[@name='username']");
	private By Ps=By.xpath("//input[@name='password']");
	private By Lo=By.xpath("//button[@type='submit']");

	public LoginOrange(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement Username()
	{
		return driver.findElement(Un);

	}
	public WebElement Password()
	{
		return driver.findElement(Ps);
	}
	public WebElement Login()
	{
		return driver.findElement(Lo);

	}
}
