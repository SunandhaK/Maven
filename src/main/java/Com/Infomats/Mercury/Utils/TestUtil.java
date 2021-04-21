package Com.Infomats.Mercury.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Com.Infomats.Mercury.Base.TestBase;

public class TestUtil extends TestBase
{
	public static void max()
	{
		driver.manage().window().maximize();
		
	}
	public static void implicit()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void screenshot()
	{
		try
		{
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("./src/main/java/Com/Infomats/Mercury/Screen/mercy"+System.currentTimeMillis()+".jpg"));
		}
		catch (Exception e) 
		{ 
		System.out.println(e.getMessage());
		}
	}	
	
}
