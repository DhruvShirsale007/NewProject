package pageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingupPageObjects {

	public static WebDriver driver;
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By Email=By.xpath("//input[@name='UserEmail']");
	private By Jobtitle=By.xpath("//select[@name='UserTitle']");
	private By CompanyId=By.xpath("//input[@name='CompanyName']");
	private By Employe=By.xpath("//select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By ServiceAgreement=By.xpath("(//div[@class='checkbox-ui'])[1]");

	public SingupPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement clickOnTryForfree1()
	{
		return driver.findElement(TryForFree);
	}
	public WebElement enterFirstname()
	{
		return driver.findElement(FirstName);
	}
	public WebElement enterLastname()
	{
		return driver.findElement(LastName);
	}
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement selectJobtitle()
	{
		return driver.findElement(Jobtitle);
	}
	public WebElement enterCompanyId()
	{
		return driver.findElement(CompanyId);
	}
	public WebElement selectEmploye()
	{
		return driver.findElement(Employe);
	}
	public WebElement enterPhone()
	{
		return driver.findElement(Phone);
	}
	public WebElement selectCountry()
	{
		return driver.findElement(Country);
	}
	public WebElement serviceAgreement()
	{
		return driver.findElement(ServiceAgreement);
	}

}
