package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HandlingExcelSheet {

	@Test
	public void loginFunctionality() throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\..Dhruv\\OneDrive\\Desktop\\Book1.xlsx");

		XSSFWorkbook  workbook=new  XSSFWorkbook(fs);

		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow   row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);

		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(1).getCell(1));

	}

}
