package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass{

	public static WebDriver driver ;

	public void driverInitialize() throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\..Dhruv\\eclipse-workspace\\DhruvMaven\\src\\main\\java\\resource\\data.properties");

		Properties p=new Properties();
		p.load(fs);

		String  browserName=p.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("plz make sure to select correct browser");
		}
	}
}
