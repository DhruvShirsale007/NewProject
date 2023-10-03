package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectsModel.SingupPageObjects;
import resource.BaseClass;

public class VerifySignup extends BaseClass{

	@Test
	public void Signup() throws IOException, InterruptedException
	{
		FileInputStream	fs=new FileInputStream("C:\\Users\\..Dhruv\\OneDrive\\Desktop\\signup.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet    sheet=workbook.getSheetAt(0);
		XSSFRow      row=sheet.getRow(0);

		XSSFCell    cell1=row.getCell(0);
		String   c1=cell1.toString();

		XSSFCell    cell2=row.getCell(1);
		String   c2=cell2.toString();

		XSSFCell    cell3=row.getCell(2);
		String   c3=cell3.toString();

		XSSFCell    cell4=row.getCell(3);
		String   c4=cell4.toString();

		XSSFCell    cell5=row.getCell(4);
		String   c5=cell5.toString();

		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(0).getCell(2));
		System.out.println(sheet.getRow(0).getCell(3));
		System.out.println(sheet.getRow(0).getCell(4));

		driverInitialize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		SingupPageObjects spo=new SingupPageObjects(driver);

		spo.clickOnTryForfree1().click();

		spo.enterFirstname().sendKeys(c1);
		spo.enterLastname().sendKeys(c2);
		spo.enterEmail().sendKeys(c3);
		spo.enterCompanyId().sendKeys(c4);
		spo.enterPhone().sendKeys(c5);
		Thread.sleep(2000);

		WebElement j=spo.selectJobtitle();
		Select s=new Select(j);
		s.selectByIndex(4);
		Thread.sleep(2000);

		WebElement k=spo.selectEmploye();
		Select t=new Select(k);
		t.selectByVisibleText("1 - 25 employees");
		Thread.sleep(2000);

		WebElement l=spo.selectCountry();
		Select u=new Select(l);
		u.selectByValue("US");
		Thread.sleep(2000);

		spo.serviceAgreement().click();
		Thread.sleep(2000);

		driver.close();

	}

}
