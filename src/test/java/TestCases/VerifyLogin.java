package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resource.BaseClass;

public class VerifyLogin extends BaseClass{

	@Test
	public void login() throws IOException, InterruptedException
	{
		driverInitialize();
		Thread.sleep(3000);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));
		UN.sendKeys("jobinjohn123@gmail.com");

		WebElement PS=driver.findElement(By.xpath("//input[@id='password']"));
		PS.sendKeys("jobin456#");

		WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton.click();

		driver.close();

	}
}
