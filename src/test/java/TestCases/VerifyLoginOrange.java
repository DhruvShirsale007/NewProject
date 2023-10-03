package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import LoginPageOrange.LoginOrange;
import resource.BaseClass;

public class VerifyLoginOrange extends BaseClass {


	@Test
	public void Login() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\..Dhruv\\OneDrive\\Desktop\\LoginOrangeHr.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);

		XSSFCell cell=row.getCell(0);
		String c1=cell.toString();

		XSSFCell cell1=row.getCell(1);
		String c2=cell1.toString();

		driverInitialize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		LoginOrange lo=new LoginOrange(driver);

		lo.Username().sendKeys(c1);
		Thread.sleep(2000);

		lo.Password().sendKeys(c2);
		Thread.sleep(2000);

		lo.Login().click();
		Thread.sleep(3000);


		driver.close();



	}
}
