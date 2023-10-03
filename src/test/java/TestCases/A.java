package TestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	@Test
	public void M1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

	}
}
